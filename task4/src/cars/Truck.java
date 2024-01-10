package cars;

import people.IOwner;

public class Truck extends Car implements ICargo {
    private double maxCargoWeight;
    private int maxCapacity;

    public Truck() {
    }

    public Truck(String model, int mileage, Color color, IOwner owner,
                 double maxCargoWeight, int maxCapacity) {
        super(model, mileage, color, owner);
        this.maxCargoWeight = maxCargoWeight;
        this.maxCapacity = maxCapacity;
    }

    public void setMaxCargoWeight(double maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", color=" + getColor() +
                ", owner=" + getOwner() +
                ", maxCargoWeight=" + maxCargoWeight +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
