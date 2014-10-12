package ua.max.pochercushki.recursion;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by mmusienko on 10/6/14.
 */

public class Factorial {

    public static void main(String[] args) {
        f(1);
    }

    public static void f(int x) {
        System.out.print(" " + x);
        if (x < 15) {
            f(2 * x);
        }
    }

}
