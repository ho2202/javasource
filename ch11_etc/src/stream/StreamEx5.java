package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김춘향", "김자바", "홍길동");

        Set<String> set = new HashSet<>(names);

        names.stream().filter(name -> name.startsWith("김")).forEach(n -> System.out.println(n));
        System.out.println();

        names.stream().distinct().filter(name -> name.startsWith("김")).forEach(n -> System.out.println(n));

        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");
        List<String> list1 = new ArrayList<>();
        for (String f : fruits) {
            list1.add(f.toUpperCase());
        }
        List<String> list2 = fruits.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());

        Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.java"),
                new File("file4.bak"));

        Set<String> exSet = new HashSet<>();
        stream.forEach(f -> {
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                exSet.add(ext);
            }
        });
        System.out.println(exSet);

        // stream.map(f -> f.getName())
        // .filter(f -> f.indexOf(".") > -1)
        // .map(f -> f.substring(
        // f.lastIndexOf(".") + 1))
        // .distinct().forEach(f -> System.out.println(f));

        Stream<File> stream2 = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.java"),
                new File("file4.bak"));
        stream2.map(f -> f.getName())
                .peek(f -> System.out.println(f + "\t"))
                .filter(f -> f.indexOf(".") > -1)
                .map(f -> f.substring(
                        f.lastIndexOf(".") + 1))
                .distinct().forEach(f -> System.out.println(f));

        System.out.println();
        fruits.stream().skip(2).limit(2).forEach(System.out::println);

        String[] arr = { "123", "456", "789" };

        Stream<String> stream3 = Stream.of(arr);

    }
}
