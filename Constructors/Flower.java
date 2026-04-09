class Flower {

    String color;
    String type;
    int price;

    Flower(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void details() {
        System.out.println("Flower color : " + this.color);
        System.out.println("Flower type : " + this.type);
        System.out.println("Flower price : " + this.price);
    }
}