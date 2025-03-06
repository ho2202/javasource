package oop;

public class Tv3 {
    private int size, channel, volume;
    private String color;
    private boolean power;

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Tv3() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
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

    @Override
    public String toString() {
        return "Tv [size=" + size + ", channel=" + channel + ", volume=" + volume + ", color=" + color + ", power="
                + power + "]";
    }

}
