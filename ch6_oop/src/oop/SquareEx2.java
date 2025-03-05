package oop;

public class SquareEx2 {
    public static void main(String[] args) {
        Square squares[] = new Square[5];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(11);
            squares[i].length = i + 10;
            System.out.println(i + 1 + "번 면적: " + squares[i].getArea());

        }

    }
}
