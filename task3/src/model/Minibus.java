package model;

import interfaces.ICargoAuto;
import interfaces.IPassengersAuto;

import java.awt.image.ImageProducer;

public class Minibus extends Car implements IPassengersAuto, ICargoAuto {
    private int maxPassengers;
    private double maxCargoWight;

    public Minibus() {
    }

    public Minibus(String model, Color color, String stateNumber, int maxPassengers, double maxCargoWight) {
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
        return "Minibus{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber='" + getStateNumber() + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", maxCargoWight=" + maxCargoWight +
                '}';
    }
}
