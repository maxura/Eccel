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

import ua.max.pochercushki.print.Print;

class WithFinal {
    private final void f() {
        Print.print("WithFinal f()");
    }

    private void g() {
        Print.print("WithFinal g()");
    }
}

class OverridingPrivate extends WithFinal {
    private final void f() {
        Print.print("OverridingPrivate f()");
    }

    private void g() {
        Print.print("OverridingPrivate g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        Print.print("OverridingPrivate2 f()");
    }

    public void g() {
        Print.print("OverridingPrivate2 g()");
    }
}


/** @author Musienko Maxim */
public class FinalOverradingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        //op.f()
        //op.g()

        WithFinal wf = op2;
        //wf.f()
        //wf.g()

    }

}
