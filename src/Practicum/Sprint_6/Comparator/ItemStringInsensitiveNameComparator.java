package Practicum.Sprint_6.Comparator;

import java.util.Comparator;

public class ItemStringInsensitiveNameComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2){
        return String.CASE_INSENSITIVE_ORDER.compare(item1.name, item2.name);
    }
}
