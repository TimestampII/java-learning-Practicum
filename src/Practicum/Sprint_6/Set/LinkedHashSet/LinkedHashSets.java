package Practicum.Sprint_6.Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSets {

    public static void main(String[] args) {
        List<String> songs = new ArrayList<>();
        fillSongs(songs);
        LinkedHashSet<String> songss = new LinkedHashSet<>(songs);
        System.out.println("Количество песен: " + songs.size());

        System.out.println("Песни:");
        for (String song : songss) {
            System.out.println("  * " + song);
        }

    }

    private static void fillSongs(List<String> songs) {
        songs.add("Sting – Shape Of My Heart");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Taylor Swift – Wildest Dreams");
        songs.add("Ariana Grande – 7 rings");
        songs.add("Depeche Mode – Personal Jesus");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Bruno Mars – Talking To The Moon");
        songs.add("Taylor Swift – Wildest Dreams");
    }
}
