package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/12/13 6:51 PM
 */
class Mug {
    Mug(int marker) {
        Print.print("Mug(" + marker + ")");
    }

    void f(int marker) {
        Print.print("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        Print.print("mug1 and mug2 is init");

    }

    Mugs() {
        Print.print("Mugs");
    }

    Mugs(int i) {
        Print.print("Mugs (int)");
    }

    public static void main(String[] args) {
        Print.print("Into method main()");
        new Mugs();
        Print.print("New Mugs() is end");
        new Mugs(1);
        Print.print("New Mugs(int) is end");

    }
}
