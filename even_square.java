package example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class even_square {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //For each can be used but better to use map

        List<Integer> list3= list.stream()
                .filter(integer -> integer%2==0)
                .map(i -> i*i)
                .collect(Collectors.toList());

        System.out.println(list3);

    }
}
