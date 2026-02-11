package com.sparta.day8.factorymethod;

import com.sparta.day8.factorymethod.instruments.Instrument;
import com.sparta.day8.factorymethod.instrumentshop.InstrumentFactory;
import com.sparta.day8.factorymethod.instrumentshop.GuitarFactory;

public class App {

    public static void main(String[] args) {

        GuitarFactory guitarFactory = new GuitarFactory();

        Instrument ibanez = buildInstrument("Ibanez", guitarFactory);

    }

    private static Instrument buildInstrument(String instrumentType, InstrumentFactory instrumentFactory) {

        Instrument instrument = instrumentFactory.processInstrument(instrumentType);

        if (instrument != null) {
            System.out.printf("Here's your %s, have a great day!", instrument.getName());
        }

        return instrument;
    }
}
