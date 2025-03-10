package poly;

public class CarEx2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();

        for (int i = 0; i < 5; i++) {
            int problemL = car2.run();
            switch (problemL) {
                case 1:
                    System.out.println("앞 왼쪽 교체");
                    car2.frontLeft = new HankookTire(i, "앞 왼쪽");
                    break;
                case 2:
                    System.out.println("앞 오른쪽 교체");
                    car2.frontRight = new HankookTire(i, "앞 왼쪽 교체");
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 교체");
                    car2.frontRight = new HankookTire(i, "뒤 왼쪽 교체");
                    break;
                case 4:
                    System.out.println("뒤 왼쪽 교체");
                    car2.frontRight = new HankookTire(i, "뒤 왼쪽 교체");
                    break;

                default:
                    break;
            }
        }
    }
}
