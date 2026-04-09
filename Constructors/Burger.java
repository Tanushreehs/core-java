class Burger {

    String color;
    String type;
    int price;

    Burger(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void details() {
        System.out.println("Burger color : " + this.color);
        System.out.println("Burger type : " + this.type);
        System.out.println("Burger price : " + this.price);
    }
}