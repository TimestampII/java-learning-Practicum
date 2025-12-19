package Practicum.Sprint_7.String.QuestString.StringBuilder;

import java.util.Scanner;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] names = new String[items.length];
        String[] counts = new String[items.length];
        String[] prices = new String[items.length];

        // 1. Разбиваем строки
        for (int i = 0; i < items.length; i++) {
            String[] parts = items[i].split(", ");
            names[i] = parts[0];
            counts[i] = parts[1];
            prices[i] = parts[2];
        }

        // 2. Находим максимальные длины
        int maxName = findMaxLength(names);
        int maxCount = findMaxLength(counts);

        // 3. Формируем строку формата (+2 пробела!)
        String format =
                "%-" + (maxName + 2) + "s" +
                        "%-" + (maxCount + 2) + "s" +
                        "%s%n";

        // 4. Печатаемд
        for (int i = 0; i < items.length; i++) {
            System.out.printf(format, names[i], counts[i], prices[i]);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}
