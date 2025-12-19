package Practicum.Sprint_7.String.QuestString.StringBuilder;

public class PalindromeLine {
    public boolean isPalindromeLine(String str) {

        // 1. Приводим к нижнему регистру и создаем StringBuilder
        StringBuilder original = new StringBuilder(str.toLowerCase());

        // 2. Удаляем пробелы циклом
        int i = 0;
        while (i < original.length()) {
            if (original.charAt(i) == ' ') {
                original.deleteCharAt(i);
                // Не увеличиваем i, так как следующий символ сместился на позицию i
            } else {
                i++;  // Переходим к следующему символу
            }
        }

        // 3. Создаем перевернутую копию
        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();

        // 4. Сравниваем
        return original.toString().equals(reversed.toString());
    }
}
