package com.sparta.day8.factorymethod.instrumentshop;

import com.sparta.day8.factorymethod.instruments.Instrument;

public abstract class InstrumentFactory {

    public Instrument processInstrument(String type) {

        Instrument instrument = makeInstrument(type);

        if (instrument != null) {

            instrument.build();
            instrument.test();
            instrument.giveToCustomer();
        }

        return instrument;
    }

    public abstract Instrument makeInstrument(String type);
}
