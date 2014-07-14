package ua.max.pochercushki.interfaces.applyinterface;

/**
 * Created with IntelliJ IDEA.
 * User: nata
 * Date: 15.07.14
 * Time: 0:31
 * To change this template use File | Settings | File Templates.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
