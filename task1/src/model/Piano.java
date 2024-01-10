package model;

import interfaces.IInstrument;

public class Piano implements IInstrument {
    @Override
    public void sound() {
        System.out.println("Пианино: играет");
    }
}
