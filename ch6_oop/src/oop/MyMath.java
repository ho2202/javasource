package oop;

public class MyMath {
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }

    int add(int a[]) {
        System.out.println("int add(int a[])");
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
