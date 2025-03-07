package extend;

public class SubString extends ListString {
    String name = "성춘향";

    @Override
    public void list() {
        super.list();

        System.out.println(name + " 하위 클래스 이름");
    }

    public void print() {
        list();
        super.list();
        exec();
    }
}
