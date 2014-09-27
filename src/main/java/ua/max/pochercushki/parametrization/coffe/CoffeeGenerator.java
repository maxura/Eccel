package ua.max.pochercushki.parametrization.coffe;

import containers.Unsupported;
import generics.coffee.Breve;
import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by mmusienko on 9/22/14.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cappuchino.class, Americano.class, ua.max.pochercushki.parametrization.coffe.Breve.class};
    private static Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());

        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }

    }


}
