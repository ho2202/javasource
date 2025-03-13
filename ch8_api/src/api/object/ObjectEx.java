package api.object;

public class ObjectEx {
    public static void main(String[] a) {
        Object object1 = new Object();
        Object object2 = new Object();
        // 주소 값 비교
        System.out.println(object1.equals(object2) ? "같다" : "다름");
        System.out.println(object1 == object2 ? "같다" : "다름");

        System.out.println("object toString : " + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        System.out.println("value toString : " + value1.toString());

        // equals를 멤버변수의 값 비교로 오버라이드
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");
        Person p1 = new Person("hong12", "홍길동");
        Person p2 = new Person("hong12", "박길동");
        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");
        System.out.println("Person toString : " + p1.toString());

    }
}
