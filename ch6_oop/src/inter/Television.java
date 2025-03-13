package inter;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");

    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOULUME) {
            this.volume = RemoteControl.MIN_VOULUME;
        } else {
            this.volume = volume;
        }
        System.out.println("TV의 볼륨: " + this.volume);

    }

}
