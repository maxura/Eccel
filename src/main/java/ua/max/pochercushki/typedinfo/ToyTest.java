package ua.max.pochercushki.typedinfo;

import net.mindview.util.Print;



/**
 * Created by mmusienko on 9/30/14.
 */
interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        Print.print("Name of class: " + cc.getName() + " Is it interfase? [" + cc.isInterface() + "]");
        Print.print("The simple name: " + cc.getSimpleName());
        Print.print("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ua.max.pochercushki.typedinfo.FancyToy");
        } catch (ClassNotFoundException e) {
            Print.print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            Print.print("Can not create the object");
            System.exit(1);
        } catch (IllegalAccessException e) {
            Print.print(e);
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
