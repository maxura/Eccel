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

class SmallBrain {

}

/** @author Musienko Maxim */
final class Dinosaur {
    int        i = 7;
    int        j = 1;
    SmallBrain x = new SmallBrain();

    void f() {
    }
}

//class Further extends Dinosaur{
//
//}
public class Jurastic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.i = 40;
        n.j++;
        n.f();

        Dinosaur x = new Dinosaur();
        x = n;

        System.out.println(x.i);
        System.out.println(x.j);

    }

}