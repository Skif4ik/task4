//3.1. Создать класс Car c полями модель, цвет(перечисление), гос. номер.
//3.2. Создать 2 интерфейса: IPassangersAuto и ICargoAuto, с методами, возвращающими соответственно максимальное количество пассажиров и максимальный вес груза
//3.3. Создать классы Sedan, Hatchback, Truck, наследующие от класса Car и реализующие подходящие по смыслу интерфейсы (Sedan и Hatchback – IPassangersAuto, Truck - ICargoAuto).
//3.4. Cоздать классы Pickup и Minibus, наследующие от класса Car и реализующие оба интерфейса
//3.5. Создать массив с информацией о двух автомобилях каждого класса
//3.6. Создать статический метод в классе Car, принимающий массив автомобилей и выводящий о них всю информацию.
//3.7. Создать статический метод в классе Car, принимающий массив автомобилей и возвращающий среднюю пассажироемкость автомобилей, реализующих соответствующий интерфейс IPassangersAuto.
//3.8. Создать статический метод в классе Car, принимающий массив автомобилей и возвращающий среднюю грузоподъемность автомобилей, реализующих соответствующий IPassangersAuto.
//3.9. Создать статический метод в классе Car, осуществляющий сортировку автомобилей по модели по алфавиту (использовать Comparable или Comparator по желанию).
//3.10. Создать статический метод в классе Car, осуществляющий сортировку в соответствии порядковыми значениями цветов перечисления Цвет(сортировка в соответствии с методом ordinal(), мы разбирали этот метод), используя интерфейс компаратор и анонимный класс
//3.11. Продемонстрировать работу статических методов.
import model.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Nessan", Color.WHITE, "3568II", 3),
                new Sedan("Audi", Color.BLACK, "2564BI", 3),
                new Hatchback("Lada", Color.GRAY, "5987BA", 4),
                new Hatchback("BMW", Color.RED, "6541AA", 4),
                new Truck("Mercedes", Color.BLUE, "9564II", 3000),
                new Truck("Volvo", Color.WHITE, "9855BH", 3000),
                new Minibus("Mercedes", Color.GRAY, "6665PA", 7, 2000),
                new Minibus("Volkswagen", Color.BLACK, "5555II", 7, 2000),
                new Pickup("Nessan", Color.WHITE, "5454BA", 3, 2500),
                new Pickup("Dodge", Color.BLUE, "1234AA", 3, 2500),
        };

        Car.showCar(cars);
        System.out.println("Средняя пассажироемкость автомобилей: " + Car.averagePassengersCapacityCar(cars));
        System.out.println("Средняя грузоподъемность автомобилей: " + Car.averageCargoCapacityCar(cars));
        System.out.println("Сортировка по модели");
        Car.sortByModelCar(cars);
        Car.showCar(cars);

        System.out.println("Сортировка по порядковыми значениями цветов "); //белый,серый,черный,красный,синий
//        CarOrdinalColorComparator cars2 = new CarOrdinalColorComparator();
//        Arrays.sort(cars, cars2);
        Car.sortByOrdinalColorCar(cars);
        Car.showCar(cars);


    }
}
