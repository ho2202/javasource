package inter;

interface I {
    void methodB();
}

class Aa {
    public void methodA(I i) { // 인터페이스로 변경
        i.methodB();
    }
}

// 인터페이스 추가
class Bb implements I {
    @Override
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest2 {
    public static void main(String[] args) {

        Aa obj1 = new Aa();
        obj1.methodA(new Bb());

    }
}
