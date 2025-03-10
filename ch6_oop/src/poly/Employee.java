package poly;

public class Employee {
    private String name;
    private String position;

    void work() {
        System.out.println(name + " " + position + "가 일한다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
