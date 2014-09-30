package ua.max.pochercushki.parametrization.util;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmusienko on 9/26/14.
 */
public class GenericVarargs {
    public static <T> List<T> maleList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String>ls = maleList("A");
        System.out.println(ls);
        ls = maleList("A","B");
        System.out.println(ls);
        ls = maleList("A","B","C");
        System.out.println(ls);
        ls=maleList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
