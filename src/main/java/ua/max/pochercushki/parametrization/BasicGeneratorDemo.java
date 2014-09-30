package ua.max.pochercushki.parametrization;

import ua.max.pochercushki.parametrization.util.Generator;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 29.09.14
 * Time: 0:04
 * To change this template use File | Settings | File Templates.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
