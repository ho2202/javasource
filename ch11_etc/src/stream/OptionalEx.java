package stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {
    public static void main(String[] args) {
        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.println("result2 = " + x));

        OptionalInt optInt = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println(optInt.isPresent());
        System.out.println(optInt2.isPresent());

    }
}
