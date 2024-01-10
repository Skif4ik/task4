package model;

import interfaces.ICargoAuto;
import interfaces.IPassengersAuto;

import java.util.Arrays;
import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String model;
    public Color color;
    private String stateNumber;  // цифры и буквы

    public Car() {
    }

    public Car(String model, Color color, String stateNumber) {
        this.model = model;
        this.color = color;
        this.stateNumber = stateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public static void showCar(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    // метод возвращающий среднюю пассажироемкость автомобилей, реализующих соответствующий интерфейс IPassengersAuto.
    public static double averagePassengersCapacityCar(Car[] cars) {
        int counter = 0, amountPas = 0;
        for (Car car : cars) {
            if (car instanceof IPassengersAuto) {
                amountPas = amountPas + ((IPassengersAuto) car).maxPassengers();
                counter++;
            }
        }
        if (counter > 0) {
            return (double) amountPas / counter;
        } else {
            return -1;
        }
    }

    // метод возвращающий среднюю грузоподъемность автомобилей, реализующих соответствующий ICargoAuto,.
    public static double averageCargoCapacityCar(Car[] cars) {
        int counter = 0, amountCargo = 0;
        for (Car car : cars) {
            if (car instanceof ICargoAuto) {
                amountCargo += ((ICargoAuto) car).maxCargo();
                counter++;
            }
        }
        if (counter > 0) {
            return (double) amountCargo / counter;
        } else {
            return -1;
        }
    }

    //метод осуществляющий сортировку автомобилей по модели по алфавиту
    @Override
    public int compareTo(Car otherCar) {
        return model.compareToIgnoreCase(otherCar.model);
    }

    public static void sortByModelCar(Car[] cars) {
        Arrays.sort(cars);
    }

    //метод осуществляющий сортировку в соответствии порядковыми значениями цветов
// используя интерфейс Comparator  и анонимный класс

    public static void sortByOrdinalColorCar(Car[] car1) {
        {
            Arrays.sort(car1, new Comparator<Car>() {
                @Override
                public int compare(Car car1, Car car2) {
                    return car1.getColor().ordinal() - car2.getColor().ordinal();
                }
            });
        }
    }


}
