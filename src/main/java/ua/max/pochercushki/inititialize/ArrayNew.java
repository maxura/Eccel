package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 14.11.13
 * Time: 23:37
 * To change this template use File | Settings | File Templates.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int []a;
        Random rand = new Random(47);
        a= new int[rand.nextInt(20)];
        Print.print("Lengh: " + a.length);
        Print.print(Arrays.toString(a));
    }

}
