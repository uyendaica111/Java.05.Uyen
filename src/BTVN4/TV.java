package BTVN4;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
    }
    public void turnOn(){
        System.out.println("1");
    }
    public void turnOff(){
        System.out.println("0");
    }
    public void setChannel(int newChannel){
        System.out.println("1");
    }
    public void setVolume(int newVolumeLevel) {
        System.out.println("100");
    }
    public void channelUp() {
        System.out.println("1");
    }
    public void channelDown() {
        System.out.println("-1");
    }
    public void volumeUp() {
        System.out.println("1");
    }
    public void volumeDown() {
        System.out.println("-1");
    }
}

