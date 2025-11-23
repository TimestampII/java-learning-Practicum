package Practicum.Sprint_6.Map.Method;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefault {
    public static void main(String[] args) {
        // хеш-таблица содержит информацию о количестве жителей в разных городах
        Map<String, Integer> citiesPopulation = new HashMap<>();
        citiesPopulation.put("Москва", 12_655_050);
        citiesPopulation.put("Лондон", 8_961_989);
        citiesPopulation.put("Нью-Йорк", 8_804_190);

        // попытаемся узнать, каким будет население Парижа через год
        String city = "Париж";
        Integer cityPopulation = citiesPopulation.getOrDefault(city, 19_900_089);
        System.out.println("Через 1 год население города " + city + " будет: " + (int) (cityPopulation * 1.01));
    }
}