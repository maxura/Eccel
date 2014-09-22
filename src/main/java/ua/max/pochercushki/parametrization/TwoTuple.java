package ua.max.pochercushki.parametrization;

/**
 * Created by mmusienko on 9/15/14.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return ("(" + first + "," + second + ")");
    }
}
