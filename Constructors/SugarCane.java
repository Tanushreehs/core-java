class SugarCane {

    int height;
    String quality;

    SugarCane(int height, String quality) {
        this.height = height;
        this.quality = quality;
    }

    void show() {
        System.out.println("Height: " + this.height);
        System.out.println("Quality: " + this.quality);
    }
}