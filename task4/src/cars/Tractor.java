package cars;

import people.IOwner;

public class Tractor extends Car implements ICargo{
    private int maxCargoWeight;

    public Tractor() {
    }

    public Tractor(String model, int mileage, Color color, IOwner owner, int maxCargoWeight) {
        super(model, mileage, color, owner);
        this.maxCargoWeight = maxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", color=" + getColor() +
                ", owner=" + getOwner() +
                ", maxCargoWeight=" + maxCargoWeight +
                '}';
    }
}