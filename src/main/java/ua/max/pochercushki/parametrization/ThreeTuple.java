package ua.max.pochercushki.parametrization;

/**
 * Created by mmusienko on 9/15/14.
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    public String toString() {
        return ("(" + first + ", " + second + ", " + third + ")");
    }
}
