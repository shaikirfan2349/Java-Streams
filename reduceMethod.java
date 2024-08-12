package example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceMethod {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3,1,4,6,7,10);

        Optional<Integer> output = input.stream()
                .reduce((i,j)->i*j);

        System.out.println(output);
    }
}
