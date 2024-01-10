//2.1. Создать иерархию классов, позволяющих хранить информацию о домашних питомцах (кличка и цвет). Известно, что надо хранить информацию о рыбках, собаках, и котиках (британских, норвежских и мейн кунах).
//2.2. Известно, что различным животным могут соответствовать различные поведения: кушать, издавать голос, плавать, вилять хвостом и играть. Известно, что каждое животное, которое умеет играть, также обязательно умеет вилять хвостом.
//2.3. Все животные умеют кушать.
//2.4. Рыбки умеют плавать и вилять хвостом.
//2.5. Собаки умеют играть, плавать и издавать голос.
//2.6. Все коты умеют издавать голос
//2.7. Британские коты умеют играть.
//2.8. Норвежские коты умеют играть и плавать.
//2.9. Мейн куны умеют играть и плавать.
//2.10. Создать массив, содержащий по два животных каждого класса.
//2.11. Для наглядности все выводы информации о животных 2.12-2.20, осуществить в main, в дальней по желанию для тренировки можно перенести их в статические методы класса Питомец, принимающие необходимую информацию.
//2.12 Вывести информацию обо всех животных и продемонстрировать, что они  умеют кушать.
//2.13. В отдельный массив скопировать животных, удовлетворяющих только
//поведению издавать голос (в качестве типа массива указать тип соответствующего
//интерфейса). Вывести информацию об этих животных и издать голос.
//2.14. Используя основной массив, продемонстрировать, как кушают только коты.
//2.15. Используя основной массив, вывести информацию о том, как плавают только рыбки.
//2.16. Используя основной массив, вывести информацию о том, как издают голос все животные, которые умеют это.
//2.17. Используя основной массив, вывести информацию о том, как плавают все животные, которые умеют это.
//2.18. Используя основной массив, вывести и информацию о том, как плавают коты, которые умеют это.
//2.19. Вывести самый распространенный цвет среди всех питомцев.
//2.20. Вывести самый распространенный цвет среди кошек.

import interfaces.ISwim;
import interfaces.IVoice;
import model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Fish("Jordan", Color.RED);
        Pet pet2 = new Dog("Rex", Color.BLACK);
        Pet pet3 = new British("Murzik", Color.WHITE);

        pet1.eat();
        pet2.eat();

        //невозможно создать объект интерфейса (можно воспользовавшись
        //анонимным классом)
        //IVoice iVoice = new IVoice();
        //в переменных интерфейса можно хранить объекты классов, реализующих
        //этот интерфейс
        //однако через переменные интерфейса видны только методы этого
        //интерфейса и методы Object
        IVoice voice1 = (IVoice) pet2;
        voice1.voice();

        System.out.println("----------------------------------------------");

        Pet[] pets = {
                new Fish("Jordan", Color.RED),
                new Dog("Rex", Color.BLACK),
                new British("Murzik", Color.WHITE),
                new Norway("Bars", Color.WHITE),
                new MCune("Barsik", Color.COLOURFUL),
                new Fish("Star", Color.GRAY),
                new Dog("Barbos", Color.WHITE)
        };
        //2.12 Вывести информацию обо всех животных и продемонстрировать, что они  умеют кушать.
        System.out.println("Вывод всех животных и они кушают");
        for (Pet pet : pets) {
            System.out.println(pet);
            pet.eat();
        }
        //2.13. В отдельный массив скопировать животных, удовлетворяющих только поведению издавать голос
        IVoice[] voices = new IVoice[pets.length];
        int index = 0;
        //собираем в отдельный массив только животных, которые могут издавать голос
        for (Pet pet : pets) {
            //если текущее животное умеет издавать голос
            if (pet instanceof IVoice)
                voices[index++] = (IVoice) pet;
        }
        voices = Arrays.copyOf(voices, index);
        System.out.println("================Животные издают голос:");
        for (IVoice pet : voices) {
            //System.out.println(pet);
            pet.voice();// был создан отдельный новый массив
        }
        //2.14. Используя основной массив, продемонстрировать, как кушают только коты.
        System.out.println("=================Кушают только коты");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                pet.eat();
            }
        }
        //2.15. Используя основной массив, вывести информацию о том, как плавают только рыбки.
        System.out.println("==============Плавают только рыбки");
        for (Pet pet : pets) {
            if (pet instanceof Fish) {
                ((Fish) pet).swim();
            }
        }
        //2.16. Используя основной массив, вывести информацию о том, как издают голос все животные, которые умеют это.
        System.out.println("====================Животные издают голос");
        for (Pet pet : pets) {
            //if(pet instanceof IVoice v){  // v = (IVoice) pet
            if (pet instanceof IVoice) {
                ((IVoice) pet).voice();//v.voice()
            }
        }
        //2.17. Используя основной массив, вывести информацию о том, как плавают все животные, которые умеют это.
        System.out.println("====================Животные плавают");
        for (Pet pet : pets) {
            if (pet instanceof ISwim) {
                ((ISwim) pet).swim();
            }
        }
        //2.18. Используя основной массив, вывести и информацию о том, как плавают коты, которые умеют это.
        System.out.println("====================Коты плавают");
        for (Pet pet : pets) {
            if (pet instanceof Cat && pet instanceof ISwim) {
                ((ISwim) pet).swim();
            }
        }
        //2.19. Вывести самый распространенный цвет среди всех питомцев
        int[] colorCounters = new int[Color.values().length];// массив для счетчиков, размер равен перечислению
        for (Pet pet : pets) {
            colorCounters[pet.getColor().ordinal()]++;// обращаемся к определенному полю и увеличиваем индекс созданного массива
            //[pet.getColor().ordinal()] -это номер 2
        }
        int indPopularColor = 0, maxPopularColor = colorCounters[0];
        //ищум самый популярный цвет-т.е. индекс
        for (int i = 0; i < colorCounters.length; i++) {
            if (colorCounters[i] > maxPopularColor) {
                maxPopularColor = colorCounters[i];
                indPopularColor = i; // записываем индекс переменной
            }
        }
        System.out.println("Самый популярный цвет: " + Color.values()[indPopularColor]);

        //2.20. Вывести самый распространенный цвет среди кошек.
        int[] colorCounterCat = new int[Color.values().length];
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                colorCounterCat[pet.getColor().ordinal()]++;
            }
        }
        int indPopularColorCat = 0, maxPopularColorCat = colorCounterCat[0];
        for (int i = 0; i < colorCounterCat.length; i++) {
            if (colorCounterCat[i] > maxPopularColorCat) {
                maxPopularColorCat = colorCounterCat[i];
                indPopularColorCat = i;
            }
        }
        System.out.println("Самый популярный цвет у котов: " + Color.values()[indPopularColorCat]);
    }
}


