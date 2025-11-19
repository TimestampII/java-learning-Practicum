package Practicum.Sprint_6.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fill {

    public static void main(String[] args){
        List<Long> listOfLongs = new ArrayList<>();
        listOfLongs.add(157478403L);
        listOfLongs.add(2450033L);
        listOfLongs.add(32039458858604L);

        System.out.println(listOfLongs);

        Collections.fill(listOfLongs, 55555555L);
        System.out.println(listOfLongs);
    }

}
