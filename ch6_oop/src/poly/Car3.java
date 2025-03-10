package poly;

public class Car3 {
    Tire frontLeft = new HankookTire(0, null);
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    int num;

    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
