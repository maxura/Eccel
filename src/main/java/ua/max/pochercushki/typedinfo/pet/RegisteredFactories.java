package ua.max.pochercushki.typedinfo.pet;

import ua.max.pochercushki.typedinfo.pet.Fact.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteerBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
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

class AirFilter extends Filter {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }

}


class OilFilter extends Filter {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {

}


class FanBelt extends Belt {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}


class PowerSteerBelt extends Belt {
    public static class Factory implements ua.max.pochercushki.typedinfo.pet.Fact.Factory<PowerSteerBelt> {
        @Override
        public PowerSteerBelt create() {
            return new PowerSteerBelt();
        }
    }
}


public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }


}
