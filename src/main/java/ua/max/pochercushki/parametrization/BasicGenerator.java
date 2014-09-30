package ua.max.pochercushki.parametrization;

import ua.max.pochercushki.parametrization.util.Generator;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 28.09.14
 * Time: 23:46
 * To change this template use File | Settings | File Templates.
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
