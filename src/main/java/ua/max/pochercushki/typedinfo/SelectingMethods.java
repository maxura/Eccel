package ua.max.pochercushki.typedinfo;

import net.mindview.util.Print;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 28.10.14
 * Time: 23:55
 * To change this template use File | Settings | File Templates.
 */

class MetodSelector implements InvocationHandler {
    private Object proxied;

    public MetodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting"))
            Print.print("Proxy to find interesting method");
        return "";
    }
}

interface SomeMethods {
    void boring1();

    void boring2();

    void interesting(String arg, int a, String s);

    void boring3();
}

class Implementation implements SomeMethods {

    @Override
    public void boring1() {
        Print.print("boring1");
    }

    @Override
    public void boring2() {
        Print.print("boring2");
    }

    @Override
    public void interesting(String arg, int a, String s) {
        Print.print("interesting " + arg + " " + a + " " + s);
    }

    @Override
    public void boring3() {
        Print.print("boring3");
    }
}

public class SelectingMethods {
    public static void main(String[] args) {
        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[]{SomeMethods.class}, new MetodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobono", 3, "mmm");
        proxy.boring3();
    }
}
