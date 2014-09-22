package ua.max.pochercushki.interfaces;

import net.mindview.util.Print;

/**
 * Created by mmusienko on 9/9/14.
 */

interface Service {
    void method1();

    void method2();

}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    Implementation1() {
    }

    @Override
    public void method1() {
        Print.print("Implementation method 1");
    }

    @Override
    public void method2() {
        Print.print("Implementation method 2");
    }
}

class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {
    Implementation2() {
    }

    @Override
    public void method1() {
        Print.print("Implementation2 method 1");
    }

    @Override
    public void method2() {
        Print.print("Implementation2 method 2");
    }
}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
}


public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }

}
