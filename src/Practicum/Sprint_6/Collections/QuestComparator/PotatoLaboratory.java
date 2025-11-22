package Practicum.Sprint_6.Collections.QuestComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        if (potatoes.size() < 4) {
            return new ArrayList<>(); // или выбрось исключение
        }

        // Создаем копию чтобы не изменять оригинальный список
        List<Potato> copy = new ArrayList<>(potatoes);
        List<Potato> result = new ArrayList<>();

        // Находим ДВЕ САМЫЕ МАЛЕНЬКИЕ картошки
        Potato min1 = Collections.min(copy);
        copy.remove(min1); // удаляем ОБЪЕКТ, не ID!

        Potato min2 = Collections.min(copy);
        copy.remove(min2);

        // Находим ДВЕ САМЫЕ БОЛЬШИЕ картошки
        Potato max1 = Collections.max(copy);
        copy.remove(max1);

        Potato max2 = Collections.max(copy);

        // Добавляем в правильном порядке: от меньших к большим
        result.add(min1);
        result.add(min2);
        result.add(max2); // обрати внимание на порядок!
        result.add(max1);

        return result;
    }
}