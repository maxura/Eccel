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
package ua.max.pochercushki.polimorfism;

import ua.max.pochercushki.print.Print;

/** @author Musienko Maxim */

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        Print.print("Create Characteristic " + s);
    }

    protected void dispose() {
        Print.print("To Finish Characteristic");
    }

}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        Print.print("Create Description " + s);
    }

    protected void dispose() {
        Print.print("To Finish Description");
    }
}


class LivingCreature {
    private Characteristic p = new Characteristic("Living Creature");
    private Description    t = new Description("Just living Creature");

    LivingCreature() {
        Print.print("LivingCreature()");
    }

    protected void dispose() {
        Print.print("Dispose into LivingCreature");
        p.dispose();
        t.dispose();
    }
}

//class Animal

public class Frog {
}
