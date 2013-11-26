package ua.max.pochercushki.pramet;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 27.11.13
 * Time: 0:09
 * To change this template use File | Settings | File Templates.
 */
public class FiveTouple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E fifth;

    public FiveTouple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }

    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + "," + fifth + ")";
    }
}