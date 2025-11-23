package Practicum.Sprint_6.Map.Method;

import java.util.HashMap;
import java.util.Map;

public class Remove {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        data.put("key3", "value3");

        String key1Value = data.remove("key1");
        System.out.println("Значение которое раньше хранилось по ключу key1: " + key1Value);

        System.out.println("Содержимое хеш-таблицы data: " + data);

        String key5Value = data.remove("key5");
        System.out.println("Значение которое раньше хранилось по ключу key5: " + key5Value);
    }
}
