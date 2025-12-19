package Practicum.Sprint_7.String.QuestString.Исключения.СоздаемСвоеИсключение;

class InputException extends Exception {
    private final double inputValue;

    public InputException(String message) {
        super(message);
        this.inputValue = 0;
    }

    public InputException(String message, double inputValue) {
        super(message);
        this.inputValue = inputValue;
    }

    public double getInputValue() {
        return inputValue;
    }
}