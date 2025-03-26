package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);

        double count = intStream.filter(i -> i % 2 == 0).average().getAsDouble();
        System.out.println(count); // 짝수 갯수

        intStream = IntStream.rangeClosed(1, 10);

        OptionalInt opnt = intStream.filter(i -> i % 2 == 0).max();
        System.out.println(opnt); // 최댓값

        int sum = intStream.filter(i -> i % 2 == 0).sum();
        System.out.println(sum); // 값

    }
}
