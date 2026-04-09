class Acid {

    String color;
    String type;
    int level;

    Acid(String color, String type, int level) {
        this.color = color;
        this.type = type;
        this.level = level;
    }

    void details() {
        System.out.println("Acid color : " + this.color);
        System.out.println("Acid type : " + this.type);
        System.out.println("Acid level : " + this.level);
    }
}