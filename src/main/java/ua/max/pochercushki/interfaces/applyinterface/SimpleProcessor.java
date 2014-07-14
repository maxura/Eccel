package ua.max.pochercushki.interfaces.applyinterface;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 15.07.14
 * Time: 0:45
 * To change this template use File | Settings | File Templates.
 */
public abstract class SimpleProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }


    public abstract String process(Object input) ;

    String s="If we weighs the same as duck,  she is made of wood";

    public static void main(String[] args) {
        Apply.process(new UpperCase(), s);
    }
}
