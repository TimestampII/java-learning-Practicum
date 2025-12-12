package Practicum.Sprint_7.String.QuestString.StringBuilder.Quest;

public class Quest1 {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder poems = new StringBuilder();

        for (int i = 0; i < poem.length; i++) {
            if (poem[i] != "" && poem[i] != "   ") {

                String line = poem[i].trim();
                poems.append(line).append("\n");
            }

        }
        return poems.toString();
    }

    public static void main(String[] args) {
        Quest1 poemFixer = new Quest1();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}
