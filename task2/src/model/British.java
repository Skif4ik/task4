package model;

import interfaces.IFindPopularColor;
import interfaces.IPlay;

public class British extends Cat implements IPlay, IFindPopularColor {

    public British() {
    }

    public British(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Британский кот " + getNickname()+ " кушает");
    }

    @Override
    public void play() {
        System.out.println("Британский кот " + getNickname()+ " играет");
    }

    @Override
    public void wag() {
        System.out.println("Британский кот " + getNickname()+ " виляет");
    }

    @Override
    public String toString() {
        return "British{" +
                "nickname='" + getNickname() + '\'' +
                ", color=" + getColor() +
                '}';
    }

    @Override
    public void findPopularColor() {

    }
}