package Practicum.Sprint_7.String.QuestString.StringBuilder;

public class Palindrome {
    public boolean isPalindromeWord(String str) {
        if (str == null){
            return false;
        }
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse.equals(str);
    }
}
