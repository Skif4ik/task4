package model;

import interfaces.IFindPopularColor;
import interfaces.IVoice;

public abstract class Cat extends Pet implements IVoice {

    public Cat() {
    }

    public Cat(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void voice() {
        System.out.println("Котик " + getNickname() + " мяукает");
    }
}
