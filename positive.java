package example.streams;

import java.util.Arrays;
import java.util.List;

public class positive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1,3,5,-5,3,-10);

         Boolean output=list.stream()
                .allMatch(i -> i>0);

        System.out.println(output);

    }
}
