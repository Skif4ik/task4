package model;

import interfaces.IPlay;
import interfaces.ISwim;

public class MCune extends Cat implements ISwim, IPlay {

    public MCune() {
    }

    public MCune(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Мейн кун " + getNickname()+ " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Мейн кун " + getNickname()+ " плавает");
    }

    @Override
    public void play() {
        System.out.println("Мейн кун " + getNickname()+ " играет");
    }

    @Override
    public void wag() {
        System.out.println("Мейн кун " + getNickname()+ " виляет");
    }

    @Override
    public String toString() {
        return "MCune{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}