package extend;

public class Circle extends Shape {
    Point point; // x, y
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center = %d, %d, r = %s, color = %s\n", point.x, point.y, r, color);
    }
}
