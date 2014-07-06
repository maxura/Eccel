package ua.max.pochercushki.interfaces;

import ua.max.pochercushki.polimorfism.Note;
import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 05.07.14
 * Time: 0:36
 * To change this template use File | Settings | File Templates.
 */
abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}


class Wind extends Instrument {

    public void play(Note n) {
        Print.print("Wind Play () " + n);
    }

    public String what() {
        return "Wind";
    }


    public void adjust() {
    }
}


class Percusion extends Instrument {

    public void play(Note n) {
        Print.print("Percusion Play () " + n);
    }

    public String what() {
        return "Percusions";
    }


    public void adjust() {
    }
}

class Stringed extends Instrument {

    public void play(Note n) {
        Print.print("Stringed Play () " + n);
    }

    public String what() {
        return "Stringed";
    }


    public void adjust() {
    }
}


class Brass extends Instrument {

    public void play(Note n) {
        Print.print("Brass Play () " + n);
    }

    public String what() {
        return "Brass";
    }


    public void adjust() {
    }
}


class Wood extends Instrument {

    public void play(Note n) {
        Print.print("Wood Play () " + n);
    }

    public String what() {
        return "Wood";
    }


    public void adjust() {
    }
}

class WoodWind extends Instrument {

    public void play(Note n) {
        Print.print("WoodWind Play () " + n);
    }

    public String what() {
        return "WoodWind";
    }


    public void adjust() {
    }
}


public class Music4 {

    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orcestra = {new Wind(), new Percusion(), new Stringed(), new Brass(), new WoodWind()};
        tuneAll(orcestra);
    }

}
