package model;

import interfaces.ICargoAuto;
import interfaces.IPassengersAuto;

public class Pickup extends Car implements IPassengersAuto, ICargoAuto {
    private int maxPassengers;
    private double maxCargoWight;

    public Pickup() {
    }

    public Pickup(String model, Color color, String stateNumber, int maxPassengers, double maxCargoWight) {
        super(model, color, stateNumber);
        this.maxPassengers = maxPassengers;
        this.maxCargoWight = maxCargoWight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getMaxCargoWight() {
        return maxCargoWight;
    }

    public void setMaxCargoWight(double maxCargoWight) {
        this.maxCargoWight = maxCargoWight;
    }

    @Override
    public double maxCargo() {
        return maxCargoWight;
    }

    @Override
    public int maxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber='" + getStateNumber() + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", maxCargoWight=" + maxCargoWight +
                '}';
    }
}