package oop;

public class SingletonEx {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2 ? "같음" : "다름");

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같음" : "다름");
    }
}
