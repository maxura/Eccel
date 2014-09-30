package ua.max.pochercushki.typedinfo;

import net.mindview.util.Print;

/**
 * Created by mmusienko on 9/29/14.
 */
class Candy {
    static {
        Print.print("Loading of the class Candy");
    }
}

class Gum {
    static {
        Print.print("Loading of the class Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading of the class Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        Print.print("in the method main()");
        new Candy();
        Print.print("After creatig Candy)");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            Print.print("Class Gum has not been found");
        }
        Print.print("after calling of the method Class for name \" Gum\"");
        new Cookie();
        Print.print("After Creating of the object Cookie");
    }
}

