package ua.max.pochercushki.parametrization.coffe;

/**
 * Created by mmusienko on 9/22/14.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getCanonicalName() + " " + id;
    }
}


