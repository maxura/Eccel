package ua.max.pochercushki.innerclasses;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 15.09.14
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */

public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmany");
    }
}
