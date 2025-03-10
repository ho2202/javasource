package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();

        child1.method1();
        child1.method2();
        child1.method3();

        parent.method1();
        parent.method2();

        Child child3 = (Child) parent;
        child3.method3();

        Parent parent2 = new Parent();

        child3 = (Child) parent2;
        child3.method3();
    }
}
