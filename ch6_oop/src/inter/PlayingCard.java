package inter;

public interface PlayingCard {
    public static final int SPADE = 4;

    void pause();

    static void display() {
    }

    default void print() {
    }

}
