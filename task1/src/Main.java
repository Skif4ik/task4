import model.*;
import interfaces.IInstrument;

public class Main {
    public static  void main(String[] args) {
//1.1. Создать интерфейс Instrument, содержащий метод, демонстрирующий «звучание» игры на инструменте.
//1.2. Cоздать 5 классов музыкальных инструментов, реализующих интерфейс Instrument (класс родитель для Инструментов не создавать)
//1.3. Сформировать массив музыкальных инструментов
//1.4. Вывести на экран, как «звучат» инструменты


        IInstrument[] intstruments = {
                new Drum(),
                new Guitar(),
                new Flute(),
                new Piano(),
                new Cymbals()
        };

        for (IInstrument intstrument : intstruments) {
            intstrument.sound();
        }

    }
}