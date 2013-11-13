package ua.max.pochercushki.inititialize;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 14.11.13
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */
public class ArraysOfPrimitive {
    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5};
        int [] a2 ;
        a2=a1;
        for (int i = 0; i < a2.length; i++)
            a2[i] = a2[i]+1;
            for (int j = 0; j < a2.length; j++)
                Print.print("a1["+j+"]= "+a1[j]);
        }
    }

