/*
 *
 * CODENVY CONFIDENTIAL
 * ________________
 *
 * [2012] - [2014] Codenvy, S.A.
 * All Rights Reserved.
 * NOTICE: All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package ua.max.pochercushki.reusingclasses;

import java.util.Random;

import static ua.max.pochercushki.print.Print.print;

/**
 * @author Musienko Maxim
 */
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //Can be of the constans time compilation
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    //open constant time of compilation
    public static final int VALUE_THREE = 39;
    //Can not be constants
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //Arrays
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4=" + i4 + " INT_5=" + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //  fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++;
        // fd1.v2=new Value(0);
        // fd1.VAL_3=new Value(1);
        //fd1.a =new int[3];
        print(fd1);
        print("Create FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);

    }

}
