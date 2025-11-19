package Practicum.Sprint_6.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Copy {

    public static void main(String[] args) {
        List<Long> listOfSmallLongs = new ArrayList<>();
        listOfSmallLongs.add(1L);
        listOfSmallLongs.add(2L);
        listOfSmallLongs.add(3L);

        List<Long> listOfBigLongs = new ArrayList<>();
        listOfBigLongs.add(10000000000L);
        listOfBigLongs.add(20000000000L);
        listOfBigLongs.add(30000000000L);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);

        Collections.copy(listOfSmallLongs, listOfBigLongs);

        System.out.println(listOfSmallLongs);
        System.out.println(listOfBigLongs);
    }
}
