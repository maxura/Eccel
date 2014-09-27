package ua.max.pochercushki.parametrization;

import gui.List;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;
import ua.max.pochercushki.parametrization.New;

import java.util.Map;

/**
 * Created by mmusienko on 9/23/14.
 */
public class LimitOfInference {
    static void f(Map<Person, java.util.List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        //f(New.map());
    }

}
