package poly;

public class EmployeeEx {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("홍길동");
        employee1.setPosition("사원");
        employee1.work();

        employee1 = new Ceo();
        employee1.setName("김길동");
        employee1.setPosition("대표");
        employee1.work();

        employee1 = new PartTime();
        employee1.setName("이민지");
        employee1.setPosition("시간제");
        employee1.work();

        employee1 = new Admin();
        employee1.setName("관리자");
        employee1.setPosition("Admin");
        employee1.work();

    }
}
