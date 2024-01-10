package model;

import interfaces.IInstrument;

public class Cymbals implements IInstrument {
    @Override
    public void sound() {
        System.out.println("Тарелки: бам-бам");
    }
}
