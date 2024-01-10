package model;

import interfaces.IInstrument;

public class Drum implements IInstrument {

    @Override
    public void sound() {
        System.out.println("Барабан: бум-бум");
    }
}
