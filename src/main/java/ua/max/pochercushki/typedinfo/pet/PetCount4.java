package ua.max.pochercushki.typedinfo.pet;

import ua.max.pochercushki.print.Print;

/**
 * Created by Natalya on 05.10.2014.
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)){
            Print.printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        Print.print();
        Print.print(counter);
    }
}
