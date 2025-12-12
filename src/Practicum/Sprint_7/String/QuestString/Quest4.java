package Practicum.Sprint_7.String.QuestString;

public class Quest4 {
    public class SubstringFunctions {
        public boolean endsWith(String initial, String other) {
            int chrs = initial.length();
            int cha = other.length();
            int a = chrs - cha;
            return initial.indexOf(other) == a;
        }
    }
}
