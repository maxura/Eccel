package ua.max.pochercushki.inititialize;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/15/13 3:24 PM
 */
class A {
    int i;
}

public class VarArgs {
    public static void printArray(Object[] args) {
        for (Object obj : args)
            System.out.print(obj + " ");
            System.out.println();

    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(43), new Float(3.14), new Double(11.11)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}
