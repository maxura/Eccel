package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 11.11.13
 * Time: 1:00
 * To change this template use File | Settings | File Templates.
 */

class Cup {
    Cup(int marker) {
        Print.print("Cup(" + marker + ")");
    }

    void f1(int marker) {
        Print.print("f1(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;

    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        Print.print("Cups");
    }
}

public class ExplicitCup {
    public static void main(String[] args) {
        Print.print("Inside main");
        Cups.cup1.f1(99);
    }

 //   static Cups cups1 = new Cups();
 //   static Cups cups2 = new Cups();
}
