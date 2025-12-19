package Practicum.Sprint_7.String.QuestString.StringBuilder;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(text);
        while (stringBuilder.indexOf(substring) != -1) {
            count++;
            stringBuilder.delete(0,stringBuilder.indexOf(substring) + substring.length());
        }
        return count;
    }
}