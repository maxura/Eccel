package ua.max.pochercushki.typedinfo.pet;

import ua.max.pochercushki.typedinfo.pet.Fact.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 06.10.14
 * Time: 23:58
 * To change this template use File | Settings | File Templates.
 */
class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static {

    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<FuelFilter> {

        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

public class RegisteredFactories {
}
