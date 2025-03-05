package oop;

import java.util.Arrays;

public class SquareEx {
    public static void main(String[] args) {
        Square square = new Square(13);
        Square square1 = new Square();

        square.getArea();
        square1.length = 22;

        System.out.println(square);
        System.out.println(square1);

        Square squares[] = new Square[5];
        System.out.println(Arrays.toString(squares));

        squares[0] = new Square(11);
        squares[1] = new Square(8);
        squares[2] = new Square(7);
        squares[3] = new Square(6);
        squares[4] = new Square(5);

        for (int i = 0; i < squares.length; i++) {
            System.out.println(i + 1 + "번 면적: " + squares[i].getArea());
        }

        // int arr[] = new int[5];
        // System.out.println(Arrays.toString(arr));
        // arr[0] = 15;
    }
}
