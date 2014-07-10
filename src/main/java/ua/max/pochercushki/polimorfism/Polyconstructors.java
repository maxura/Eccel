package ua.max.pochercushki.polimorfism;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 25.06.14
 * Time: 0:00
 * To change this template use File | Settings | File Templates.
 */
class Glyph {
    void draw() {
        Print.print("Glyph draw()");
    }

    Glyph() {
        Print.print("Glyph before invocation draw()");
        draw();
        Print.print("Glyph after invocation draw()");
    }
}

class Roundglyph extends Glyph {
    private int radius = 1;

    Roundglyph(int r) {
        radius = r;
        Print.print("RoundGlyph RoundGlyph(), radius= " + radius);
    }
    void draw(){
        Print.print("RoundGlyph.draw(), radius= " + radius);
    }
}

public class Polyconstructors {
    public static void main(String[] args) {
        new Roundglyph(5);
    }
}
