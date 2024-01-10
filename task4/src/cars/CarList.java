package cars;

import people.IOwner;

import java.util.Arrays;

public class CarList {
    //динамический массив автомобилей Car, расширяемый на 50% при уже полностью заполненном массиве
    private static final int INITIAL_SIZE = 6;
    Car[] cars = new Car[INITIAL_SIZE];
    private int currentIndex = 0;

    // - добавления одного автомобиля,
    public void add(Car car) {
        if (car != null) {
            if (currentIndex == cars.length) {
                cars = Arrays.copyOf(cars, cars.length * 3 / 2 + 1);
            }
            cars[currentIndex++] = car;
        }
    }

    // добавления массива автомобилей,
    public void addCars(Car... addCars) {
        for (Car addCar : addCars) {
            add(addCar);
        }
    }

    //- вывода информации обо всех автомобилях,
    public void showCars() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(cars[i]);
        }
    }

    //- поиск автомобиля по индексу (возвращает автомобиль)
    public boolean isValidIndex(int index) {
        return index >= 0 && index < currentIndex;
    }

    public Car getCarByIndex(int index) {
        Car car = null;
        if (isValidIndex(index)) {
            car = cars[index];
        }
        return car;
    }
//- поиск автомобиля по параметру (принимает автомобиль сравнение с помощью equals, возвращает индекс первого совпадения)


    //- поиск по владельцу (возвращает массив все автомобилей принадлежащих указанному владельцу).
    public Car[] getCarsByOwner(IOwner owner) {
        int j = 0;
        Car[] carsByOwner = new Car[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            if (cars[i].getOwner().equals(owner)) {
                carsByOwner[j++] = cars[i];
            }
        }
        carsByOwner = Arrays.copyOf(carsByOwner, j);
        return carsByOwner;
    }

    //- метод, возвращающий массив только грузовых автомобилей
    public ICargo[] getCargoCars() {
        ICargo[] cargoCars = new ICargo[currentIndex];
        int j = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (cars[i] instanceof ICargo) {
                cargoCars[j++] = (ICargo) cars[i];
            }
        }
        cargoCars = Arrays.copyOf(cargoCars, j);
        return cargoCars;
    }

    // - метод, возвращающий массив пассажирских автомобилей
    public PassengerCar[] getPassengerCar() {
        PassengerCar[] passengerCars = new PassengerCar[currentIndex];
        int j = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (cars[i] instanceof PassengerCar) {// в 17 версии можно завести переммную и не надо будет преобразовывать
                passengerCars[j++] = (PassengerCar) cars[i];
            }
        }
        passengerCars = Arrays.copyOf(passengerCars, j);
        return passengerCars;
    }

    // - метод, возвращающий среднюю грузоподъемность грузовых автомобилей
    public double getAvgCargoWeight(ICargo[] cargoCars) {  // у нас уже есть массив грузовых авто
        double sum = 0;
        for (ICargo cargoCar : cargoCars) {
            sum += cargoCar.getMaxCargoWeight();
        }
        return sum / cargoCars.length;
    }

    // - метод, возвращающий среднюю пассажировместимость пассажирских автомобилей
    public double getAvgPassengerCar(PassengerCar[] passengerCars) {
        double sum = 0;
        for (PassengerCar passengerCar : passengerCars) {
            sum += passengerCar.getPassengerNumber();
        }
        return sum / passengerCars.length;
    }

}