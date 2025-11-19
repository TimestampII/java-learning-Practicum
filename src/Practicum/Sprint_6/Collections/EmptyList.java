package Practicum.Sprint_6.Collections;

import java.util.Collections;
import java.util.List;

public class EmptyList {

    public static void main(String[] args) {

        final List<String> emptyList = Collections.emptyList();
        final List<String> singletonList = Collections.singletonList("Привет, мир!");
        final List<String> nCopiesList = Collections.nCopies(5, "Java");

        System.out.println(emptyList);
        System.out.println(singletonList);
        System.out.println(nCopiesList);


    }
}
