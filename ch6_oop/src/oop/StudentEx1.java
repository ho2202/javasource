package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student 인스턴트 생성, 사용
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s12345", "홍길동", 2, 3, "010-1212-1212", "gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
