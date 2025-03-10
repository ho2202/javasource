package poly;

public class Parent {
    String field;

    public void method1() {
        System.out.println("parent method()");
    }

    public void method2() {
        System.out.println("parent method2()");
    }
}

class Child extends Parent {
    String field2;

    public void method3() {
        System.out.println("Child method3()");
    }

    @Override
    public void method2() {
        System.out.println("Child method2()");
    }
}