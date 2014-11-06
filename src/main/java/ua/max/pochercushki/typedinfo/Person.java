package ua.max.pochercushki.typedinfo;

/**
 * Created by mmusienko on 11/6/14.
 */
class Person {
    public final String first;
    public final String last;
    public final String adress;

    public Person(String first, String last, String adress) {
        this.first = first;
        this.last = last;
        this.adress = adress;
    }

    public String toString() {
        return "Person: " + first + " " + last + " " + adress;
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }

        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
