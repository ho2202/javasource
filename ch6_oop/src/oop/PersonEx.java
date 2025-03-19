package oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p = new Person();
        Person2 p2 = Person2.builder().pno("123").name("강길동").tel("010-").build();
        // 모든 멤버변수의 setter 작성됨
        p.setName("홍길동");
        p.setTel("010-1-1");
        p.setPno("123");
        // 하나의 멤버변수의 setter 작성됨
        p2.setName(null);

        System.out.println(p);
    }
}
