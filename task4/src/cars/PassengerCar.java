package cars;

import people.IOwner;

public class PassengerCar extends Car{
    private int passengerNumber;

    public PassengerCar() {
    }

    public PassengerCar(String model, int mileage, Color color, IOwner owner, int passengerNumber) {
        super(model, mileage, color, owner);
        this.passengerNumber = passengerNumber;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "model='" + getModel() + '\'' +
                ", mileage=" + getMileage() +
                ", color=" + getColor() +
                ", owner=" + getOwner() +
                ", passengerNumber=" + passengerNumber +
                '}';
    }
}
