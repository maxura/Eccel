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

import net.mindview.util.Print;

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        Print.print("Stringed.play " + n);
    }
}


class Brass extends Instrument {
    @Override
    public void play(Note n) {
        Print.print("Brass.play " + n);
    }
}


/** @author Musienko Maxim */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }


    public static void main(String[] args) {
        Wind fluete = new Wind();
        Stringed violine = new Stringed();
        Brass frenchHorn = new Brass();
        tune(fluete);
        tune(violine);
        tune(frenchHorn);
    }

}
