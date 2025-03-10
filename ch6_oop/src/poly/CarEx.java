package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = new FireEngine();

        car.drive();
        car.stop();

        FireEngine FCar = (FireEngine) car;
        FCar.water();

        ((FireEngine) car).water();

        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance");
        }
        if (car instanceof Car) {
            System.out.println("Car의 instance");
        }

        Animal d = new Dog();
        if (d instanceof Animal) {
            System.out.println("Animal의 instance");
        }
    }
}
