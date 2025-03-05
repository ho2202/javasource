package oop;

public class Square {
    int length;
    long area;

    public Square() {
    }

    public Square(int sidelength) {
        this.length = sidelength;
        this.area = sidelength * sidelength;
    }

    long getArea() {
        area = length * length;
        return area;
    }

    @Override
    public String toString() {
        return "Square [length=" + length + ", area=" + area + "]";
    }

}