package cars;

import people.IOwner;

public abstract class Car {
    private String model;
    private int mileage;
    private Color color;
    private IOwner owner; // НАШ ИНТЕРФЕЙС

    public Car() {
    }

    public Car(String model, int mileage, Color color, IOwner owner) {
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public IOwner getOwner() {
        return owner;
    }

    public void setOwner(IOwner owner) {
        this.owner = owner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (mileage != car.mileage) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + mileage;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}