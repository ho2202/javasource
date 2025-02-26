package op;

public class ArthmeticEx1 {

    static void printf(int a, char operator, int b){
        int result1 = 0;
        double result = 0 ;

        switch (operator) {
            case '+':
                result1 = a + b;
                // 결과 출력
                System.out.printf("%d %c %d = %d\n", a, operator, b, result1);
                break;
            case '-':
                result1 = a - b;
                // 결과 출력
                System.out.printf("%d %c %d = %d\n", a, operator, b, result1);
                break;
            case '*':
                result1 = a * b;
                // 결과 출력
                System.out.printf("%d %c %d = %d\n", a, operator, b, result1);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                // 결과 출력
                System.out.printf("%d %c %d = %.2f\n", a, operator, b, result);
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                // 결과 출력
                System.out.printf("%d %c %d = %.2f\n", a, operator,b, result);
                break;

            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 4;
        
        printf(a, '+', b);
        printf(a,'-', b);
        printf( a,'*',b);
        printf(a,'/',b);
        printf(a,'%',b);
        System.out.printf("%d / %f = %f\n", a,(float)b, a/(float)b);

    }
}
