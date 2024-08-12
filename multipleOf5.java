package example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class multipleOf5 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,15,35,33,55,10);

        List<Integer> li = list.stream()
                .filter(i -> i%5==0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(li);
    }
}
