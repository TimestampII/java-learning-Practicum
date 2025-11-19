package Practicum.Sprint_6.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {

        // создаем список товаров
        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки:");
        System.out.println(items);

        // создаем объекты-компаратор по цене
        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();
        ItemPopularityComparator itemPopularityComparator = new ItemPopularityComparator();
        ItemStringInsensitiveNameComparator comparator = new ItemStringInsensitiveNameComparator();

        // применяем компаратор
        items.sort(itemPriceComparator);

        System.out.println("После сортировки по возрастанию цены:");
        System.out.println(items);

        // создаем обратный компаратор цен
        Comparator<Item> reversedItemPriceComparator = itemPriceComparator.reversed();

        // применяем его
        items.sort(reversedItemPriceComparator);
        System.out.println("После сортировки по убыванию цены:");
        System.out.println(items);

    }
}
