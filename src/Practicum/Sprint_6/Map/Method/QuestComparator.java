package Practicum.Sprint_6.Map.Method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestComparator {
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }
    public static Map <String, Integer> assignSeats(List<String> passengerNames){
        // Нужно написать код, который будет распределять места в самолете
        Map<String, Integer> seats = new HashMap<>();
        int seat = 1;
        for (String name: passengerNames){
            seats.put(name, seat);
            seat++;
        }
        return seats;
    }
}
