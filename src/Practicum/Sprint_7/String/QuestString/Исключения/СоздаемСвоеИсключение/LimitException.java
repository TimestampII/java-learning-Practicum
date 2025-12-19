package Practicum.Sprint_7.String.QuestString.Исключения.СоздаемСвоеИсключение;

public class LimitException extends RuntimeException {
    private final int attempts;

    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}
