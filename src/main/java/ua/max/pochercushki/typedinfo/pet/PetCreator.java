//: typeinfo/pets/PetCreator.java
// Creates random sequences of Pets.
package ua.max.pochercushki.typedinfo.pet;

import typeinfo.pets.*;
import typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    Random rand = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public Pet rundomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

} ///:~
