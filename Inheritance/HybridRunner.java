interface Camera {
    void clickPhoto();
}

interface MusicPlayer {
    void playMusic();
}


class Device {
    void powerOn() {
        System.out.println("Device is powering ON");
    }
}
class Smartphone extends Device implements Camera, MusicPlayer {

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

class HybridRunner {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone();

        smartphone1.powerOn();
        smartphone1.clickPhoto();
        smartphone1.playMusic();
    }
}