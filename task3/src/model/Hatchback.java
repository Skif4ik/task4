package model;

import interfaces.IPassengersAuto;

public class Hatchback extends Car implements IPassengersAuto {
    private int maxPassengers;

    public Hatchback() {
    }

    public Hatchback(String model, Color color, String stateNumber, int maxPassengers) {
        super(model, color, stateNumber);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int maxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "Hatchback{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber='" + getStateNumber() + '\'' +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}
