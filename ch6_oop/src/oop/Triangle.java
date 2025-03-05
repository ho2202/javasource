package oop;

public class Triangle {
    double baseLine, height;

    public Triangle() {
    }

    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    double getArea() {
        return baseLine * height / 2;
    }
}
