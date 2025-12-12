package Practicum.Sprint_7.String.QuestString;
public class Quest2 {
    private boolean isCapsLock = false;

    public void capsLock() {
        isCapsLock = true;// Здесь нужно изменить значение флага isCapsLock на противоположное
    }

    public void print(String str) {
        // а здесь нужно распечатать строку или в верхнем регистре, или без изменений, учитывая флаг
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}