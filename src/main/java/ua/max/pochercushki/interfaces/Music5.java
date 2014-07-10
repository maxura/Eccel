package ua.max.pochercushki.interfaces;

import net.mindview.util.Print;
import ua.max.pochercushki.polimorfism.Note;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 09.07.14
 * Time: 0:21
 * To change this template use File | Settings | File Templates.
 */

interface Instrument_ {
    int VALUE = 5;

    void play(Note n);

    void adjust();
}

class Wind_ implements Instrument_ {
    public void play(Note n) {
        Print.print(this + "play () " + n);
    }


    public String toString() {
        return "Wind ";
    }

    public void adjust() {
        Print.print(this + "adjust () ");
    }
}

class Percussion implements Instrument_ {
    public void play(Note n) {
        Print.print(this + "play () " + n);
    }


    public String toString() {
        return "Percussion ";
    }

    public void adjust() {
        Print.print(this + "adjust () ");
    }
}


class Stringed_ implements Instrument_ {
    public void play(Note n) {
        Print.print(this + "play () " + n);
    }


    public String toString() {
        return "Stringed ";
    }

    public void adjust() {
        Print.print(this + "adjust () ");
    }
}

class Brass_ extends Wind_ {

    public String toString() {
        return "Brass ";
    }
}

class Wood_ extends Wind_ {
    public String toString() {
        return "Wind ";
    }
}

public class Music5 {
    static void tune(Instrument_ i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument_[] e) {
        for (Instrument_ i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument_ []orcestra ={ new Wind_(), new Percussion(), new Stringed_(), new Brass_(), new Wood_()};
        tuneAll(orcestra);
    }

}
