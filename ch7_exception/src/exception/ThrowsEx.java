package src.exception;

public class ThrowsEx {
    public static void main(String[] args) throws ClassNotFoundException {
        print();
    }

    private static void print() throws ClassNotFoundException {
        Class.forName("");
    }

}
