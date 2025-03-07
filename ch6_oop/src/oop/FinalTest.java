package oop;

// public final class FinalTest {
//     // final class : 상속 금지
// }
// class test extends FinalTest{

// }

public class FinalTest {
    final int Max_SIZE = 10;

    final void getMaxSize() {
        // Max_SIZE = 20;
        // final int LV = Max_SIZE;
        // LV = 10;
    }
}

class Test extends FinalTest {
    // getMaxSize()
}
