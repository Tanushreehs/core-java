class Sword {

    String color;
    String type;
    int length;

    Sword(String color, String type, int length) {
        this.color = color;
        this.type = type;
        this.length = length;
    }

    void details() {
        System.out.println("Sword color : " + this.color);
        System.out.println("Sword type : " + this.type);
        System.out.println("Sword length : " + this.length);
    }
}