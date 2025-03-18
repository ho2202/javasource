package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + name + "";
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }
}

class Course<T> {
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>(capacity);
    }

    public String getName() {
        return this.name;
    }

    public String getStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudents'");
    }

}

class CourseEx {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 20);

    }

    static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }
}