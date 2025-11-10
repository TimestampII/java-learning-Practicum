package Practicum.Sprint_6.List;

import java.util.ArrayList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();

        list.add(0L);
        list.add(1L);
        list.add(2L);
        System.out.println(list); // список выглядит так - [0, 1, 2]

        // добавление элемента по индексу
        list.add(2, 22L); // 2L сдвигаем вправо, и на его месте появится 22L
        System.out.println(list); //список стал таким - [0, 1, 22, 2]

        // вставка элемента в конец списка
        list.add(4, 4L);
        System.out.println(list); // обновляем список - [0, 1, 22, 2, 4]

        // удаляем элементы
        list.remove(4); // по индексу
        list.remove(2L); // по значению
        System.out.println(list); // получиться список - [0, 1, 22]

        // получение и вывод элементов по индексу
        System.out.println(list.get(2)); // напечатали 22

        // замена элементов по индексу
        list.set(2, 33L);
        System.out.println(list); // последняя версия списка - [0, 1, 33]

        String[] citiesArray = {"Воронеж", "Южно-Сахалинск", "Иркутск"};

        // Создание и заполнение списка из массива:
        List<String> cities = List.of(citiesArray);
        System.out.println(cities);

        // Создание и заполнение списка из набора значений:
        List<String> otherCities = List.of("Амстердам", "Токио", "Рим");
        System.out.println(otherCities);
    }
}
