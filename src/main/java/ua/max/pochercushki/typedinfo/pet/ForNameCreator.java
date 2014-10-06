//: typeinfo/pets/ForNameCreator.java
package ua.max.pochercushki.typedinfo.pet;

import net.mindview.util.CountingGenerator;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    public static String[] typesNames = {"ua.max.pochercushki.typedinfo.pet.Mutt",
            "ua.max.pochercushki.typedinfo.pet.Pug", "ua.max.pochercushki.typedinfo.pet.EgyptianMau",
            "ua.max.pochercushki.typedinfo.pet.Manx", "ua.max.pochercushki.typedinfo.pet.Cymric", "ua.max.pochercushki.typedinfo.pet.Rat",
            "ua.max.pochercushki.typedinfo.pet.Mouse", "ua.max.pochercushki.typedinfo.pet.Hamster"};

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typesNames)
                types.add((Class < ?extends Pet >) Class.forName(name));

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    } ///:~
static {loader();}
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}