package Practicum.Sprint_7.String.QuestString.StringBuilder;

public class Practicum {
    public static void main(String[] args) {
        String[] rainbow = new String[]{
                "Красный",
                "Оранжевый",
                "Жёлтый",
                "Зелёный",
                "Голубой",
                "Синий",
                "Фиолетовый"
        };

        StringBuilder sbRainbow = new StringBuilder(String.join(", ", rainbow));

        System.out.println(sbRainbow.toString());
    }
}