package ua.max.pochercushki.parametrization;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 29.09.14
 * Time: 0:00
 * To change this template use File | Settings | File Templates.
 */
public class CountedObject {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
