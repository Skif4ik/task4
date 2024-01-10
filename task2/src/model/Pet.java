package model;

import interfaces.IFindPopularColor;



public abstract class Pet  {
    private String nickname;
    private Color color;

    public Pet() {
    }

    public Pet(String nickname, Color color) {
        this.nickname = nickname;
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void eat();
    //voice()



}