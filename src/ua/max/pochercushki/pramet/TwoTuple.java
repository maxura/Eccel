package ua.max.pochercushki.pramet;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 26.11.13
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }
}

