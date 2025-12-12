package Practicum.Sprint_7.String.QuestString;

public class Quest1 {
    public String fixString(String str) {
        if (str.isBlank()) {
            System.out.println("Вы ничего не ввели!");
        } else {
            str = str.trim();
        }
        return str;
    }
}
