package model;

import interfaces.IPlay;
import interfaces.ISwim;
import interfaces.IVoice;

public class Dog extends Pet implements IVoice, ISwim, IPlay {

    public Dog() {
    }

    public Dog(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Собачка " + getNickname() + " кушает");
    }

    @Override
    public void voice() {
        System.out.println("Собачка " + getNickname() + " лает");
    }

    @Override
    public void swim() {
        System.out.println("Собачка " + getNickname() + " плавает");
    }

    @Override
    public void play() {
        System.out.println("Собачка " + getNickname() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Собачка " + getNickname() + " виляет");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
