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

import static net.mindview.util.Print.print;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i=" + i + " " + "j=" + j);
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 is initialized");

    static int printInit(String s) {
         print(s);
        return 47;
    }


}

/** @author Musienko Maxim */
public class Beetle extends Insect {
    private int k = printInit("Field beetle k is initializing");

    public Beetle() {
        print("k=" + k);
        print("j=" + j);
    }


    private static int x2 = printInit("static Field beetle x2 is initializing");

    public static void main(String[] args) {
        print("Constructor Beetle");
        Beetle b = new Beetle();
    }

}
