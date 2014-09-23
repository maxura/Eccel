package ua.max.pochercushki.parametrization;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 22.09.14
 * Time: 0:20
 * To change this template use File | Settings | File Templates.
 */
public class RundomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RundomList<String> rs = new RundomList<String>();
        for (String s : ("The quick brown fox jumped over" + "the lazy brown dog").split(" "))
            rs.add(s);

        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select());

        }
    }

}
