package extend;

public class Triangle extends Shape {
    Point[] points;

    public Triangle(Point[] points) {
        this.points = points;
    }

    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s\n", points[0].getXY(), points[1].getXY(),
                points[2].getXY(), color);
    }
}
