package ua.max.pochercushki.interfaces.adapter;

import interfaces.interfaceprocessor.Processor;
import net.mindview.util.RandomGenerator;
import ua.max.pochercushki.interfaces.applyinterface.Apply;


/**
 * Created by Natalya on 17.07.2014.
 */

class FilterAdapter implements Processor, ua.max.pochercushki.interfaces.applyinterface.Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }


}

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);

    }
}