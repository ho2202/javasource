package oop;

public class TriangleEx {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.baseLine = 13;
        triangle.height = 7;

        Triangle triangle2 = new Triangle(13, 5);

        System.out.println("면적: " + triangle.getArea());
        System.out.println("면적: " + triangle2.getArea());
    }
}
