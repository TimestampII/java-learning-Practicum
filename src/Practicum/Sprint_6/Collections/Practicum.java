package Practicum.Sprint_6.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Practicum {
    public static void main(String[] args) {
        final Collection<String> colors = new ArrayList<>();
        colors.add("Желтый");
        colors.add("Красный");

        final Collection<String> colorsAdditional = new ArrayList<>();
        colorsAdditional.add("Зеленый");
        colorsAdditional.add("Желтый");

        colors.addAll(colorsAdditional);
        System.out.println(colors);

        final Collection<String> greenAndRed = new ArrayList<>();
        greenAndRed.add("Зеленый");
        greenAndRed.add("Красный");
        System.out.println("Список содержит Зеленый и Красный: " + colors.containsAll(greenAndRed));

        final Collection<String> yellowOnly = new ArrayList<>();
        yellowOnly.add("Желтый");
        colors.removeAll(yellowOnly);

        System.out.println(colors);
    }
}
