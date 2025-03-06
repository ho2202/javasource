package oop;

public class Tv2 {
    private int size, channel, volume;
    private String color;
    private boolean power;

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Tv2() {
    }

    void changeChannel(int ch) {
        channel = ch;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void volumeUp() {
        volume++;
    }

    void volumeDown() {
        volume--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", channel=" + channel + ", volume=" + volume + ", color=" + color + ", power="
                + power + "]";
    }

}
