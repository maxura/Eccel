package ua.max.pochercushki.interfaces.applyinterface;

import ua.max.pochercushki.print.Print;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 15.07.14
 * Time: 0:43
 * To change this template use File | Settings | File Templates.
 */
public class Apply {
    public static void process(Processor p, Object s){
        Print.print("Using the Pcocessor " + p.name());
        Print.print(p.process(s));
    }
}
