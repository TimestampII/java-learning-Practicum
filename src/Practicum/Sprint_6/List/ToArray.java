package Practicum.Sprint_6.List;

import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск");

        // создаем массив, равный размеру списка cities
        String[] citiesArray = new String[3];

        // результат метода записывается одновременно и в otherCities, и в citiesArray
        String[] otherCities = cities.toArray(citiesArray);

        for (String city : citiesArray) { // печатаем citiesArray
            System.out.println(city + ", ");
        }

        System.out.println();

        for (String city : otherCities) { // печатаем otherCities
            System.out.println(city + ", ");
        }
    }
}
