package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 14.11.13
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */
public class ArraysClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[]a = new Integer[rand.nextInt(20)];
        Print.print("Lengh a" + a);
        for (int i=0; i<a.length; i++)
            a[i]=rand.nextInt(500);
            Print.print(Arrays.toString(a));

    }
}
