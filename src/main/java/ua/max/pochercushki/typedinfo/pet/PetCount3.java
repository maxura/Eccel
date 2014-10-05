package ua.max.pochercushki.typedinfo.pet;

import containers.LinkedHashMapDemo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.MapData;
import net.mindview.util.Print;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Natalya on 05.10.2014.
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.alltypes, 0));
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet())
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
        }

        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }

            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            Print.printnb(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        ua.max.pochercushki.print.Print.print();
        Print.print(petCount);
    }
}
