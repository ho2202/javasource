package ch1;

public class VarIntEx1 {
    public static void main(String[] args) {
        int age = 15, maxSpeed = 2048;
        int max = Integer.MAX_VALUE;
        System.out.println("나이: " + age + ", 최고 속도: " + maxSpeed + ", max: " + max);
        System.out.println(age + maxSpeed);
        
        System.out.printf("나이: $d, 최고 속도: %3d, max: %d \n", age, maxSpeed, max);

    }
}
