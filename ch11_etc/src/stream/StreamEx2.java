package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    static int sum2;

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Stream<String> stream = set.stream();

        String[] str = { "홍길동", "성춘향", "김자바" };
        Stream<String> stream2 = Arrays.stream(str);
        stream2.forEach(name -> System.out.println(name));

        Path path = Paths.get("c:/temp");
        try (Stream<Path> stream3 = Files.list(path)) {

            stream3.forEach(f -> System.out.println(f.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        IntStream.rangeClosed(1, 100).forEach(i -> sum2 += i);
        System.out.println("합: " + sum2);
    }
}
