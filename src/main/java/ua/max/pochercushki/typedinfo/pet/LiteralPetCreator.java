//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package ua.max.pochercushki.typedinfo.pet;

import java.util.*;

public class LiteralPetCreator extends PetCreator {
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> alltypes = Collections.unmodifiableList(Arrays.asList(Pet.class, Dog.class, Cat.class, Rodent.class,
            Mutt.class, Pug.class, EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class));
    private static final List<Class<? extends Pet>> types = alltypes.subList(alltypes.indexOf(Mutt.class), alltypes.size());

    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }

}
