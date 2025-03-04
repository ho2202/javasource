package oop;

public class Tv {
    // 크기, 색상, 채널, 볼륨, 해상도...
    // 채널 변경, 볼륨 변경, 전원 키고 끄기
    int size, channel, volume;
    String color;
    boolean power;

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
