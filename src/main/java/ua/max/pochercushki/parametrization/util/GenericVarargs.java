package ua.max.pochercushki.parametrization.util;

import

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
}
