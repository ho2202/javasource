package inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new Television();
        remoteControl.turnOn();

        remoteControl = new Audio();

        // 익명 구현 클래스
        remoteControl = new RemoteControl() {

            private int volume;

            @Override
            public void turnOn() {
                System.out.println("radio를 켭니다");

            }

            @Override
            public void turnOff() {
                System.out.println("radio를 끕니다");

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
                System.out.println("radio의 볼륨: " + this.volume);

            }

        };
    }
}
