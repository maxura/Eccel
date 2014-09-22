package ua.max.pochercushki.parametrization;

/**
 * Created by mmusienko on 9/15/14.
 */
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D fourh;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourh = d;
    }

    public String toString() {
        return ("(" + second + " ," + first + " ," + third + " ," + fourh + ")");
    }
}
