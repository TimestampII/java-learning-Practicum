package Practicum.Sprint_6.Map.Method;

import java.util.Map;
import java.util.HashMap;

public class QuestComparatorTwo {
    // Создаем хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения - количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        QuestComparatorTwo pizzeria = new QuestComparatorTwo();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {;
        if(orders.containsKey(clientName)){
            int currentOrderCount = orders.get(clientName);
            orders.put(clientName, currentOrderCount + 1);
        }else {
            orders.put(clientName, 1);
        }
    }

    private void printStatistics() {
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19
        int order = 0;
        for (Map.Entry<String, Integer> entries: orders.entrySet()) {
            order  = order + entries.getValue();
            System.out.println("Заказов от " + entries.getKey()+ ": " + entries.getValue());
        }
        System.out.println("Всего заказов:" + order);

    }
}


