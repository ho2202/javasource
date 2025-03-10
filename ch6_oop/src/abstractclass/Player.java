package abstractclass;

public abstract class Player {
    int currentPos;
    boolean pause;

    public Player() {
    }

    abstract void play();

    void pause() {

    }
}

class CDPlayer extends Player {

    @Override
    void play() {
        System.out.println("CD플레이어");
    }

}

class AudioPlayer extends Player {

    @Override
    void play() {
        System.out.println("Audio플레이어");
    }

}