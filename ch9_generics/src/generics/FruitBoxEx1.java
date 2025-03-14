package generics;

import java.util.ArrayList;

class Fruit {
    @Override
    public String toString() {
        return "과일";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "사과";
    }
}

class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3();
        Box3<Apple> appleBox = new Box3();

        fruitBox.add(new Fruit());
        appleBox.add(new Apple());
        System.out.println();

    }
}
