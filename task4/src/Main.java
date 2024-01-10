//4.1. Создать абстрактный класс Car, содержащий информацию об автомобиле: модель, пробег, цвет, мощность двигателя, владелец и др.
//4.2. Создать интерфейс IOwner, содержащий методы, возвращающие информацию о владельце (номер и имя) автомобиля.
//4.6. Поле владелец определить как переменную интерфейса IOwner.
//4.2. Создать интерфейс ICargo с методами, возвращающими грузоподъёмность грузовика и объём кузова.
//4.3. Создать класс Entity (юр. лицо) с полями УНП и наименование организации, реализующий интерфейс Owner.
//4.5. Создать класс Person с полями номер паспорта и ФИО, реализующий интерфейс Owner
//4.6. Для классов Entity и Person переопределить hashCode, equals, toString
//4.7. Создать класс Truck с полями максимальная грузоподъемность и объем кузова, унаследовав его от класса Car и реализовав интерфейс ICargo
//4.8. Создать класс Tractor с полем максимальная грузоподъемность, унаследовав
//его от класса Car и реализовав интерфейс ICargo (отсутствие кузова у трактора
//заставляет задуматься о default методе в ICargo, возвращающем 0)
//4.9. Создать класс PassengerCar с полем кол-во пассажирских мест унаследовав его от класса Car.
//4.10. Для автомобилей переопределить методы hashCode, equals, toString
//4.11. Создать класс-обертку CarList, реализующий динамический массив автомобилей Car, расширяемый на 50% при уже полностью заполненном массиве
//4.12. В классе CarList организовать возможность
//- добавления одного автомобиля,
//- добавления массива автомобилей,
//- вывода информации обо всех автомобилях,
//- поиск автомобиля по индексу (возвращает автомобиль)
//- поиск автомобиля по параметру (принимает автомобиль сравнение с помощью equals, возвращает индекс первого совпадения)
//- поиск по владельцу (возвращает массив все автомобилей принадлежащих указанному владельцу).
//- метод, возвращающий массив только грузовых автомобилей
//- метод, возвращающий массив пассажирских автомобилей
//- метод, возвращающий среднюю грузоподъемность грузовых автомобилей
//- метод, возвращающий среднюю пассажировместимость пассажирских автомобилей.
//4.13. Создать по 2 автомобиля разных типов:
//- легковой с владельцем «физическое лицо»;
//- легковой с владельцем «юридическое лицо»;
//- грузовой с владельцем «физическое лицо»;
//- грузовой с владельцем «юридическое лицо».
//4.14. Продемонстрировать работу методов класса CarList

import cars.*;
import people.Entity;
import people.IOwner;
import people.Person;

public class Main {
    public static void main(String[] args) {

        IOwner[] owners = {
                new Person("HB1111111", "Vasya"),
                new Entity(1234567, "YURA & Co"),
                new Person("HP2222222", "Misha"),
                new Entity(987654, "Veseliy Denek")
        };

        CarList carList1 = new CarList();
        carList1.add(new Truck("BMW", 100000, Color.WHITE, owners[0],
                5, 3));
        carList1.add(new Tractor("Belarus", 50000, Color.BLACK, owners[1],
                3));
        carList1.add(new PassengerCar("Lada", 2000000, Color.RED, owners[2],
                5));
        carList1.add(new Truck("Opel", 300000, Color.GREEN, owners[3],
                6, 2));
        carList1.add(new PassengerCar("Mers", 100, Color.WHITE, owners[2],
                5));

        System.out.println("Инфо о авто");
        carList1.showCars();
        System.out.println("Инфо о первом в списке авто");
        System.out.println(carList1.getCarByIndex(0));
        Car car = carList1.getCarByIndex(2);//третий в списке

        System.out.println("Список авто по владельцу");
        System.out.println(owners[2]);

        CarList carList2 = new CarList();
        carList2.addCars(carList1.getCarsByOwner(owners[2]));
        carList2.showCars();

        System.out.println("Только грузовые");
        ICargo[] cargoCars1 = carList1.getCargoCars();
        for (ICargo cargo : cargoCars1) {
            System.out.println(cargo);
        }

        System.out.println("Только пассажирские");
        PassengerCar[] passengerCar1 = carList1.getPassengerCar();
        for (PassengerCar passengerCar : passengerCar1) {
            System.out.println(passengerCar);
        }
        System.out.println("Cредняя грузоподъемность грузовых автомобилей " + carList1.getAvgCargoWeight(cargoCars1));
        System.out.println("Средняя пассажировместимость пассажирских автомобилей " + carList1.getAvgPassengerCar(passengerCar1));
    }
}