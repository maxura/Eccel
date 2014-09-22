package ua.max.pochercushki.parametrization;

/**
 * Created by mmusienko on 9/15/14.
 */
public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E five;

    FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        five = e;
    }

    public String toString() {
        return ("(" + second + " ," + first + " ," + third + " ," + fourh + " ," + five + ")");
    }
}
