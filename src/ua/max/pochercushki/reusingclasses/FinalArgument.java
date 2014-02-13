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

/** @author Musienko Maxim */
class Gizmo {
    public void spin() {
    }
}

public class FinalArgument {
    public void with(final Gizmo g) {
//g= new Gizmo();
    }

    public void withoutGizmo(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    void f(final int i) {
        //i++;
    }

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArgument bf = new FinalArgument();
        bf.withoutGizmo(null);
        bf.with(null);
    }


}