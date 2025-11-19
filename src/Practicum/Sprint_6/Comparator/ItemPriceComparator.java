package Practicum.Sprint_6.Comparator;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {

        // используем статический метод compare(Integer, Integer) из класса Integer
        return Integer.compare(item1.price, item2.price);
    }
}

