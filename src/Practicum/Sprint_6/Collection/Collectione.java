package Practicum.Sprint_6.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collectione {

    public static void main(String[] args) {
        final Collection<String> colors = new ArrayList<>();
        colors.add("Желтый");
        colors.add("Красный");
        colors.add("Зеленый");

        System.out.println("Список содержит Зеленый: " + colors.contains("Зеленый"));

        colors.remove("Желтый");
        System.out.println(colors);

        System.out.println("Оставшееся количество элементов: " + colors.size());
        System.out.println("Коллекция пустая? " + colors.isEmpty());
    }
}
