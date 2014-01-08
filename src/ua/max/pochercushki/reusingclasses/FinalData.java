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

/** @author Musienko Maxim */
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
    private final        int   valueOne    = 9;
    private static final int   VALUE_TWO   = 99;
    //open constant time of compilation
    public static final  int   VALUE_THREE = 39;
    //Can not be constants
    private final        int   i4          = rand.nextInt(20);
    static final         int   INT_5       = rand.nextInt(20);
    private              Value v1          = new Value(11);
    private final        Value v2          = new Value(22);
    private static final Value VAL_3       = new Value(33);
    //Arrays


}
