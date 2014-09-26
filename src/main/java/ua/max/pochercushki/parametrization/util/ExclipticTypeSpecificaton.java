package ua.max.pochercushki.parametrization.util;

import gui.List;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;
import ua.max.pochercushki.parametrization.New;

import java.util.Map;

/**
 * Created by mmusienko on 9/26/14.
 */
public class ExclipticTypeSpecificaton {
    static void  f(Map<Person, java.util.List<Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.<Person, java.util.List<Pet>>map());
    }

}
