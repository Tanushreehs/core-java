class FlowerRun {

    String type;
    int price;

    FlowerRun(String type, int price) {
        this.type = type;
        this.price = price;
    }

    Flower info() {
        Flower flower = new Flower("Red", this.type, this.price);
        return flower;
    }

    void show() {
        System.out.println("FlowerRun type : " + this.type);
        System.out.println("FlowerRun price : " + this.price);
    }
}