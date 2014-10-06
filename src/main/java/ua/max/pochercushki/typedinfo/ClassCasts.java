package ua.max.pochercushki.typedinfo;

/**
 * Created by mmusienko on 10/2/14.
 */
class Building {
}

class House extends Building {
}

public class ClassCasts {
    public static void main(String[] args) {
        Building b  = new House();
        Class<House> hpusType = House.class;
        House h = hpusType.cast(b);
        h = (House)b;
    }
}
