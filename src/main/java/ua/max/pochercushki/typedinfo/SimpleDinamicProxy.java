package ua.max.pochercushki.typedinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 19.10.14
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */
class DinamicProxyHandler implements InvocationHandler {
    private Object proxy;

    public DinamicProxyHandler(Object proxy) {
        this.proxy = proxy;
    }

    public Object invoke(Object proxied, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if (args != null)
            for (Object arg : args)
                System.out.println(" " + arg);
        return method.invoke(proxy, args);
    }


}

public class SimpleDinamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");

    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DinamicProxyHandler(real));
        consumer(proxy);
    }
}
