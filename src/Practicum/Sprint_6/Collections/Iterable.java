package Practicum.Sprint_6.Collections;

import java.util.ArrayList;

public class Iterable {
    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add(" ");
        list.add("World!");

        for (String elements : list) { //  обходим все элементы в цикле forEach
            System.out.println(elements);
        }
    }
}
