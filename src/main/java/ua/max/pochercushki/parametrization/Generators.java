package ua.max.pochercushki.parametrization;

import ua.max.pochercushki.parametrization.coffe.Coffee;
import ua.max.pochercushki.parametrization.coffe.CoffeeGenerator;
import ua.max.pochercushki.parametrization.gen.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 28.09.14
 * Time: 0:07
 * To change this template use File | Settings | File Templates.
 */
public class Generators {
    public static <T>Collection<T> fill(Collection<T>coll, Generator<T>gen, int n){
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
            return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(),4);
        for (Coffee coffee1 : coffee) {
            System.out.println(coffee1);
        }

        Collection<Integer> fnummbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
        for (int i : fnummbers)
            System.out.print(i + ", ");

    }

}
