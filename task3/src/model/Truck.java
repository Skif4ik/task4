package model;

import interfaces.ICargoAuto;

public class Truck extends Car implements ICargoAuto {
    private double maxCargoWight;

    public Truck() {
    }

    public Truck(String model, Color color, String stateNumber, double maxCargoWight) {
        super(model, color, stateNumber);
        this.maxCargoWight = maxCargoWight;
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
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", color=" + getColor() +
                ", stateNumber='" + getStateNumber() + '\'' +
                ", maxCargo=" + maxCargo() +
                '}';
    }
}
