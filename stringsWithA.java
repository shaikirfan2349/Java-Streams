package example.streams;

import java.util.*;

public class stringsWithA {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "abacus", "appu", "banana");


        Optional<String> startwithA = list.stream()
                .filter(i -> i.startsWith("a"))
                .findFirst();   //optional class

        System.out.println(startwithA);
    }
}
