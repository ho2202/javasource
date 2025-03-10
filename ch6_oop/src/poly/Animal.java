package poly;

public class Animal {
    Animal() {
        System.out.println("animal 생성자");
    }
}

class Feline extends Animal {
    Feline() {
        System.out.println("Feline 생성자");
    }

}

class Canine extends Animal {
    Canine() {
        System.out.println("Canine 생성자");
    }
}

class Dog extends Canine {
    Dog() {
        System.out.println("dog 생성자");
    }
}

class Cat extends Feline {
    Cat() {
        System.out.println("cat 생성자");
    }
}