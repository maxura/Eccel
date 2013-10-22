package ua.max.pochercushki;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:mmusienko@codenvy.com">Musienko Maxim</a>
 * @version $Id: 2013 8/15/13 2:07 PM
 */
public class SomeClass2 {
    static String max = "maxura@ukr.net";
    static char   b   = 'x';
    static int afdasd = 456;

    public static void main(String[] args) throws InterruptedException {
        System.out.print(new SomeClass2().codeWithShift(max));
        System.out.println();
        new SomeClass2().fullDecode(new SomeClass2().codeWithShift(max));

    }


    private List<Integer> codeWithShift(String encode) {

        char[] symb = encode.toCharArray();
        List<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < symb.length; i++) {

            int tmp = symb[i]*2+68;
            lst.add(tmp);
        }
        return lst;

    }


//    private List<Integer> decode(List<Integer> input) {
//        List<Integer> decodeLst = new ArrayList<Integer>();
//
//        for (int i = 0; i < input.size(); i++) {
//            decodeLst.add((input.get(i)) << 1);
//        }
//
//        return decodeLst;
//
//    }


    private char[] fullDecode(List<Integer> input) {
        List<Integer> decodeLst = new ArrayList<Integer>();
        int tmp=0;

        for (int i = 0; i < input.size(); i++) {
            decodeLst.add((input.get(i) - 68) / 2);

        }
        char[] max = new char[decodeLst.size()];

        for (int i = 0; i < decodeLst.size(); i++) {

            tmp = decodeLst.get(i);
            System.out.print(" "+tmp);
            char a = (char)tmp;
        }

        return max;
    }

}


//109 97 120 117 114 97 64 117 107 114 46 110 101 116