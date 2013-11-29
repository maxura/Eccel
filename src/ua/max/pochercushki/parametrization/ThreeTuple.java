package ua.max.pochercushki.parametrization;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 26.11.13
 * Time: 23:50
 * To change this template use File | Settings | File Templates.
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public  final C third ;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }
    public String toString (){
        return "(" + first +"," +second + "," + third + ")";
    }
}
