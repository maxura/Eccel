package ua.max.pochercushki.inititialize;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/15/13 5:34 PM
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object arg : args)
            System.out.print(arg + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(43), new Float(3.14), new Double(11.11)});
        printArray(47, 14.5F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[])new Integer[]{1, 2, 3, 4,});
        printArray();
    }
}
