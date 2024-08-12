package example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class sortingList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> list=strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
