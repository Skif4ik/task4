package model;

import interfaces.IInstrument;

public class Flute implements IInstrument {
    @Override
    public void sound() {
        System.out.println("Флейта: ду-ду");
    }
}
