package Practicum.Sprint_7.String.QuestString.StringMethod.Quest2;

public class Capitalizator {
    public String capitalize(String str) {
        // Берем первый символ через substring(0, 1)
        String firstChar = str.substring(0, 1);
        // Переводим в верхний регистр
        String upperChar = firstChar.toUpperCase();
        // Возвращаем измененную строку
        return upperChar + str.substring(1);
    }
}
