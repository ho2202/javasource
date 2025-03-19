package lambda;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
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

    }
}
