package Practicum.Sprint_6.Comparator.QuestComparator;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        if (dt1.seconds > dt2.seconds) {
            return 1;
        } else if (dt1.seconds < dt2.seconds) {
            return -1;
        } else if (dt1.minutes > dt2.minutes) {
            return 1;
        } else if (dt1.minutes < dt2.minutes) {
            return -1;
        } else if (dt1.hours > dt2.hours) {
            return 1;
        } else if (dt1.hours < dt2.hours) {
            return -1;
        } else if (dt1.day > dt2.day) {
            return 1;
        } else if (dt1.day < dt2.day) {
            return -1;
        } else if (dt1.month > dt2.month) {
            return 1;
        } else if (dt1.month < dt2.month) {
            return -1;
        } else if (dt1.year > dt2.year) {
            return 1;
        } else if (dt1.year < dt2.year) {
            return -1;
        } else {
            return 0;
        }
        /*
        -Или более лаконично
        @Override
    public int compare(DateTime dt1, DateTime dt2) {
        int result;

        if ((result = Integer.compare(dt1.year, dt2.year)) != 0) return result;
        if ((result = Integer.compare(dt1.month, dt2.month)) != 0) return result;
        if ((result = Integer.compare(dt1.day, dt2.day)) != 0) return result;
        if ((result = Integer.compare(dt1.hours, dt2.hours)) != 0) return result;
        if ((result = Integer.compare(dt1.minutes, dt2.minutes)) != 0) return result;
        return Integer.compare(dt1.seconds, dt2.seconds);
    }
         */
    }
}