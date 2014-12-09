package ua.max.pochercushki.typedinfo;

/**
 * Created by mmusienko on 12/9/14.
 */
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        //  a.g();
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }

}
