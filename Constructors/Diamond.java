class Diamond {

    String color;
    String type;
    int price;

    Diamond(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void details() {
        System.out.println("Diamond color : " + this.color);
        System.out.println("Diamond type : " + this.type);
        System.out.println("Diamond price : " + this.price);
    }
}