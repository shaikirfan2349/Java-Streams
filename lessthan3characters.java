package example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lessthan3characters {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ba", "apple", "ry", "date");

        List<String>output=strings.stream()
                .filter(i -> i.length()>=3)
                .map(i -> i.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
