package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj;
        return value == v.value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

}
