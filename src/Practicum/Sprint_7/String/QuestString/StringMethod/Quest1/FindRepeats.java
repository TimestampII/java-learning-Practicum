package Practicum.Sprint_7.String.QuestString.StringMethod.Quest1;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int number = 0;
        int index = 0;
        while ((index = text.indexOf(substring,index)) != -1) {
            number++;
            index += substring.length();
        }
        return number;
    }
}
