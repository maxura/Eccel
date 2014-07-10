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

import static ua.max.pochercushki.print.Print.print;

class Instuments {
    void play(Note n) {
        print("Instrument play(): " + n);
    }


    String what() {
        return ("Wind");
    }

    void adjust() {
        print("Adjust Wind");
    }
}


class Winds extends Instuments {
    void play(Note n) {
        print("Wind play (): " + n);
    }


    String what() {
        return ("Wind");
    }

    void adjust() {
        print("Adjust instrument");
    }
}


class Percussion extends Instuments {
    void play(Note n) {
        print("Percission play (): " + n);
    }


    String what() {
        return ("Percussion");
    }

    void adjust() {
        print("Adjust Percussion");
    }
}

class Stringed_ extends Instuments {
    void play(Note n) {
        print("Stringed_ play (): " + n);
    }


    String what() {
        return ("Stringed_");
    }

    void adjust() {
        print("Stringed_ Percussion");
    }
}

class BraSs extends Winds {
    void play(Note n) {
        print("BraSs play (): " + n);
    }

    String what() {
        return ("BraSs");
    }

}

class WoodWind extends Winds {
    void play(Note n) {
        print("WoodWind play (): " + n);
    }

    String what() {
        return ("WoodWind");
    }
}

public class Music3 {
    public static void tune(Instuments i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instuments[] e) {
        for (Instuments i : e) {
            tune(i);
        }
    }


    public static void main(String[] args) {
        Instuments[] orcestra = {new Winds(), new Percussion(), new Stringed_(), new BraSs(), new WoodWind()};
        tuneAll(orcestra);
    }
}
