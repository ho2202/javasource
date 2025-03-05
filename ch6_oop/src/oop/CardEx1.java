package oop;

public class CardEx1 {
    public static void main(String[] args) {
        System.out.println("높이 " + Card.height + " 너비 " + Card.width);

        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;
        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 7;
    }
}
