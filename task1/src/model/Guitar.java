package model;

import interfaces.IInstrument;

public class Guitar implements IInstrument {
    @Override
    public void sound() {
        System.out.println("Гитара: дрын- дрын");
    }
}
