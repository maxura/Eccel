package ua.max.pochercushki.typedinfo.pet;

import ua.max.pochercushki.print.Print;
import java.util.HashMap;

/**
 * Created by Natalya on 03.10.2014.
 */
public class PetCount {
    static class Petcounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else put(type, quantity + 1);
        }
    }

    public static void countPets(PetCreator creator) {
        Petcounter counter = new Petcounter();
        for (Pet pet : creator.createArray(20)) {
            Print.printnb(pet.getClass().getSimpleName() + " ");
            if(pet instanceof Pet)
                counter.count("Pet");
            if(pet instanceof Dog)
                counter.count("Dog");
            if(pet instanceof Mutt)
                counter.count("Mutt");
            if(pet instanceof Pug)
                counter.count("Pug");
            if(pet instanceof Cat)
                counter.count("Cat");
            if(pet instanceof Manx)
                counter.count("EgyptianMau");
            if(pet instanceof Manx)
                counter.count("Manx");
            if(pet instanceof Manx)
                counter.count("Cymric");
            if(pet instanceof Rodent)
                counter.count("Rodent");
            if(pet instanceof Rat)
                counter.count("Rat");
            if(pet instanceof Mouse)
                counter.count("Mouse");
            if(pet instanceof Hamster)
                counter.count("Hamster");
        }
        Print.print();
        Print.print(counter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
