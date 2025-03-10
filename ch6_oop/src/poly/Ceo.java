package poly;

public class Ceo extends Employee {
    @Override
    void work() {
        super.work();
        System.out.println(getName() + " " + getPosition() + "가 일한다.");
    }
}

class PartTime extends Employee {
    @Override
    void work() {
        System.out.println(getName() + " " + getPosition() + "가 주어진 시간 동안 일한다.");

    }
}

class Admin extends Employee {
    @Override
    void work() {
        System.out.println(getName() + " " + getPosition() + "가 열심히 일한다.");

    }
}