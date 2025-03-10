package poly;

public class CarEx3 {
    public static void main(String[] args) {
        HankookTire fronLeft = new HankookTire(1, "앞왼쪽");
        HankookTire frontRight = new HankookTire(2, "앞오른쪽");
        HankookTire backLeft = new HankookTire(3, "뒤왼쪽");
        HankookTire backRight = new HankookTire(4, "뒤오른쪽");

        Car3 car3 = new Car3(fronLeft, frontRight, backLeft, backRight);

        System.out.println(car3.frontLeft);
        System.out.println(car3.frontLeft.accumulateRotation);
    }
}
