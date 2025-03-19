package lambda;

public class LambdaEx {
    public static void main(String[] args) {
        Lambda2 obj = () -> System.out.println("");
        obj.method();

        Lambda3 lambda3 = (a, b) -> a > b ? a : b;

        System.out.println("max: " + lambda3.max(5, 4));
    }
}
