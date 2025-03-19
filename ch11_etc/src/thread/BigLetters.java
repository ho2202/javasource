package thread;

public class BigLetters {
    public static void main(String[] args) {

        // Thread t1 = new Thread(new SmallLetters());
        // Thread t1 = new SmallLetters2();
        Thread t2 = new NumPrint();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.print(ch + "\t");
                }
            };
        });
        Runnable r = () -> {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + "\t");
            }
        };
        Thread t4 = new Thread(r);

        System.out.println("쓰레드 t1 name" + t1.getName());
        t1.start();
        System.out.println("쓰레드 t2 name" + t2.getName());
        t2.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("쓰레드 main name" + mainThread.getName());
        // 대문자 출력
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");
        }
    }
}
