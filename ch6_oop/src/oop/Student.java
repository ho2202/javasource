package oop;

public class Student {
    // 속성: 학번, 이름, 학년, 반
    // 기능: 전화번호 변경, 이메일 변경, 학년과 반 변경
    private String stuId, name;
    private int grade, classNum;
    private String phone, email;

    // 기본 생성자
    public Student() {
    }

    public Student(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    public String getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    void changeTel(String tel) {
        this.phone = tel;
    }

    void changeGrade() {

    }

    void changeEmail() {

    }

    void changeClassNum() {
    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}
