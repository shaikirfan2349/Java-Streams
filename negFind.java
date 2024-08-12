package example.streams;

import java.util.Arrays;
import java.util.List;

public class negFind {
    public static void main(String[] args) {
        List<Integer> strings = Arrays.asList(3,-4,5,1,-55,-2);

        int s = strings.stream()
                .filter(i -> i>0)
                .mapToInt(i -> i*2)
                .sum();
        System.out.println(s);
    }
}
