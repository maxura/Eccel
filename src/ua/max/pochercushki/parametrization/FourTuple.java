package ua.max.pochercushki.parametrization;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 27.11.13
 * Time: 0:00
 * To change this template use File | Settings | File Templates.
 */
public class FourTuple <A,B,C,D> extends ThreeTuple<A,B,C>  {
public final D fourth;
    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourth = d;
    }

    public String toString(){
    return "("+ first + "," +second + "," + third + ","+ fourth +")";
    }
}
