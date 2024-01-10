package model;

import interfaces.ISwim;
import interfaces.IWag;

public class Fish extends Pet implements ISwim, IWag {

    public Fish() {
    }

    public Fish(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Рыбка " + getNickname() + " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Рыбка " + getNickname() + " плавает");
    }

    @Override
    public void wag() {
        System.out.println("Рыбка " + getNickname() + " виляет");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
