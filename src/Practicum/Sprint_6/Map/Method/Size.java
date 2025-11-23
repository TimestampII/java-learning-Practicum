package Practicum.Sprint_6.Map.Method;

import java.util.HashMap;
import java.util.Map;

public class Size {
    public static void main(String[] args) {
        Map<String, String> citiesCoordinates = new HashMap<>();

        citiesCoordinates.put("Москва", "55.7558° N, 37.6173° E");
        citiesCoordinates.put("Новосибирск", "54.9833° N, 82.8964° E");
        citiesCoordinates.put("Париж", "48.8566° N, 2.3522° E");
        citiesCoordinates.put("Пекин", "39.9042° N, 116.4074° E");
        citiesCoordinates.put("Сидней", "33.8688° S, 151.2093° E");

        System.out.println("В программе есть информация о координатах " + citiesCoordinates.size() + " городов.");
    }
}

