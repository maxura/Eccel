package ua.max.pochercushki.typedinfo;

import ua.max.pochercushki.print.Print;

/**
 * Created by mmusienko on 10/8/14.
 */
class Base {
}

class Derived extends Base {
}

public class FamilyVsExactType {
    static void test(Object x) {
        Print.print("Testing the x of the type: " + x.getClass());
        Print.print(" x instance  of Base: " + (x instanceof Base));
        Print.print(" x instance  of Derived: " + (x instanceof Derived));
        Print.print(" Base.instance(x) " + Base.class.isInstance(x));
        Print.print(" Derived.instance(x) " + Derived.class.isInstance(x));
        Print.print("x.getClass() == Base.class " + (x.getClass()==Base.class));
        Print.print("x.getClass() == Derived.class " + (x.getClass()==Derived.class));
        Print.print("x.getClass().equals(Base.class)" + (x.getClass().equals(Base.class)));
        Print.print("x.getClass().equals(Derived.class)" + (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}
