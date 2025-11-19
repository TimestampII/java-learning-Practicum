package Practicum.Sprint_6.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits);


        //Методы Collections.sort(List, Comparator) и List.sort(Comparator) ведут себя одинаково.
        // Можете выбирать любой из них.
        Collections.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println(fruits);
    }
}
