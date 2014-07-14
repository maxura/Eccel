package ua.max.pochercushki.interfaces;

import ua.max.pochercushki.print.Print;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 12.07.14
 * Time: 0:34
 * To change this template use File | Settings | File Templates.
 */

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class UpperCase extends Processor {
String process(Object input){
    return ((String) input).toUpperCase();
}
}

class DownCase  extends Processor {
    String process(Object input){
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s){
        Print.print("Using the Pcocessor " + p.name());
        Print.print(p.process(s));
    }

    public  static String s="Disagreement with beliefs definition incorrect";
    public static void main(String[] args) {
process(new UpperCase(), s);
process(new DownCase(), s);
process(new Splitter(), s);
    }
}
