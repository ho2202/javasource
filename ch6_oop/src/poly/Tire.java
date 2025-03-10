package poly;

public class Tire {
    int maxRotation;
    int accumulateRotation;
    String location;

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll() {
        ++accumulateRotation;

        if (accumulateRotation < maxRotation) {
            System.out.println(location + " 수명: " + (maxRotation + accumulateRotation) + "회");
            return true;

        } else {
            System.out.println("***" + location + " Tire 펑크");
            return false;
        }
    }

}
