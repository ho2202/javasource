package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student 인스턴트 생성, 사용
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s12345", "홍길동", 2, 3, "010-1212-1212", "gmail.com");
        Student student4 = new Student("s22344", "김서방", 2, 3, "010-1212-1200", "gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        // student3.changeTel("010-1234-5678");

        // System.out.println(student3);
        studentInfo(student3);
        studentInfo(student4);
    }

    public static void studentInfo(Student student) {
        System.out.println("======================================");
        System.out.println("아이디: " + student.getStuId());
        System.out.println("이름: " + student.getName());
        System.out.println("학년: " + student.getGrade());
        System.out.println("반: " + student.getClassNum());
        System.out.println("전화번호: " + student.getPhone());
        System.out.println("이메일: " + student.getEmail());
        System.out.println("======================================");
        System.out.println();

    }
}
