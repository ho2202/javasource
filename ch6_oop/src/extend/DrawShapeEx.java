package extend;

public class DrawShapeEx {
    public static void main(String[] args) {

        Point[] p = { new Point(100, 100), new Point(50, 100), new Point(100, 50) };

        Triangle triangle = new Triangle(p);
        triangle.draw();

        Point p1 = new Point(150, 150);
        Circle c = new Circle(p1, 50);

        c.draw();
    }
}
