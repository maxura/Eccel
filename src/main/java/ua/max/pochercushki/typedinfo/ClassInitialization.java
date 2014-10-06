package ua.max.pochercushki.typedinfo;


import java.util.Random;

/**
 * Created by mmusienko on 10/1/14.
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("This is initialization of the Initable");
    }
}


class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("This is initialization of the Initable2");
    }
}


class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("This is initialization of the Initable3");
    }
}


public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating refernce Initable: ");
        //Does not lead to the initialization
        System.out.println(Initable.staticFinal);
        //Lead to the initialization
        System.out.println(Initable.staticFinal2);
        //Lead to the initialization
        System.out.println(Initable2.staticNonFinal);
        Class initiable3 = Class.forName("ua.max.pochercushki.typedinfo.Initable3");
        System.out.println("After creating refernce Initable3");
        System.out.println(Initable3.staticNonFinal);
    }

}
