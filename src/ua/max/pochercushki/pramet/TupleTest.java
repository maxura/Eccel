package ua.max.pochercushki.pramet;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 29.11.13
 * Time: 0:03
 * To change this template use File | Settings | File Templates.ian{}
 */
class Amphibian {
}

class Vechicle {
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vechicle, Amphibian, String, Integer> h() {
        return new FourTuple(new Vechicle(), new Amphibian(), "hi", 47);
    }

    static FiveTouple<Vechicle, Amphibian, String, Integer, Double> k() {
        return new FiveTouple(new Vechicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }

}
