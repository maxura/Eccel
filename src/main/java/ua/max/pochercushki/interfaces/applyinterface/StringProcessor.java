package ua.max.pochercushki.interfaces.applyinterface;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 15.07.14
 * Time: 0:45
 * To change this template use File | Settings | File Templates.
 */
public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }


    public abstract String process(Object input);

    public static String s = "If we weighs the same as duck,  she is made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new DownCase(), s);
        Apply.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    public String process(Object input) {

        return Arrays.toString(((String) input).split(" "));
    }
}
