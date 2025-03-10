package abstractclass;

public class PlayerEx {
    public static void main(String[] args) {
        // Player player = new Player() {}; 생성 불가능
        Player player = new CDPlayer();
        player.play();
        player = new AudioPlayer();
        player.play();
    }
}
