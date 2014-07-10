package ua.max.pochercushki.inititialize;

import java.util.Arrays;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 11/15/13 3:12 PM
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3
        };

        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
