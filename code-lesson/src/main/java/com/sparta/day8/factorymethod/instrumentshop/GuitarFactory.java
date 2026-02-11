package com.sparta.day8.factorymethod.instrumentshop;

import com.sparta.day8.factorymethod.instruments.Ibanez;
import com.sparta.day8.factorymethod.instruments.Instrument;

public class GuitarFactory extends InstrumentFactory {

    @Override
    public Instrument makeInstrument(String type) {

        type = type.toLowerCase();

        return switch (type) {
            case "ibanez" -> new Ibanez();
            default -> null;
        };
    }
}
