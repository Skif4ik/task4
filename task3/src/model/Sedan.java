package model;

import interfaces.IPassengersAuto;

public class Sedan extends Car implements IPassengersAuto {
    private int maxPassengers;

    public Sedan() {
    }

    public Sedan(String model, Color color, String stateNumber, int maxPassengers) {
        super(model, color, stateNumber);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int maxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber='" + getStateNumber() + '\'' +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}