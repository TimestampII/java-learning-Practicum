package Practicum.Sprint_7.String.QuestString.Исключения;


 class UserInputException extends Exception {
    public UserInputException() {
        super();
    }

    public UserInputException(final String message) {
        super(message);
    }
}
public class Practicum2 {
    public static void main(final String[] args) {
        final UserInputException userInputException = new UserInputException("Ошибка ввода!");
        System.out.println(userInputException.getMessage());
    }
}