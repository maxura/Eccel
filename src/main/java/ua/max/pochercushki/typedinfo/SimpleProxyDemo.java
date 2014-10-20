package ua.max.pochercushki.typedinfo;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 19.10.14
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    @Override
    public void doSomething() {
        Print.print("Do something");
    }

    @Override
    public void somethingElse(String arg) {
        Print.print("Do something else " + arg);
    }
}
class SimpleProxy implements Interface{
    private Interface proxied;
    SimpleProxy (Interface proxied){
        this.proxied = proxied;
    }


    @Override
    public void doSomething() {
    Print.print("SimpleProxy do something");
    proxied.doSomething();
    }
    @Override
    public void somethingElse(String arg) {
        Print.print("SimpleProxy do something else " + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
public static void consumer(Interface iface){
    iface.doSomething();
    iface.somethingElse("bonobo");
}

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
