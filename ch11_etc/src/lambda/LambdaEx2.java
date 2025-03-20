package lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(50);

        Consumer<String> consumer2 = (i) -> System.out.println(i);
        consumer2.accept("안녕");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(12.4);

        ObjDoubleConsumer<String> objDoubleConsumer = (t, all) -> System.out.println(t + " " + all);
        objDoubleConsumer.accept("null", 1.2);

        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test("")) {
            System.out.println("빈 문자열");
        }

        Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
        if (predicate1.test(2)) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        Function<Integer, String> function = (i) -> String.valueOf(i);
        System.out.println(function.apply(32));

        BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
        System.out.println(f.apply(2, 4));

    }
}
