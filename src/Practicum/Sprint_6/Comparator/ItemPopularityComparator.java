package Practicum.Sprint_6.Comparator;

import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<Item> {

    public static void main(String[] args) {

    }

    @Override
    public int compare(Item item1, Item item2) {
        // Напишите правильное сравнение.
        if (item1.popularity > item2.popularity) {
            return 1;
        } else if (item1.popularity < item2.popularity) {
            return -1;
        } else {
            return 0;
        }
    }
}