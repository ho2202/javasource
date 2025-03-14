package generics;

public class Box {
    Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(Integer.valueOf(1));
    }
}
