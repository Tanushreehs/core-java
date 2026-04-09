class Lock {

    String color;
    String type;
    int price;

    Lock(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void details() {
        System.out.println("Lock color : " + this.color);
        System.out.println("Lock type : " + this.type);
        System.out.println("Lock price : " + this.price);
    }
}