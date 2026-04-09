class Tower {

    String color;
    String type;
    int height;

    Tower(String color, String type, int height) {
        this.color = color;
        this.type = type;
        this.height = height;
    }

    void details() {
        System.out.println("Tower color : " + this.color);
        System.out.println("Tower type : " + this.type);
        System.out.println("Tower height : " + this.height);
    }
}