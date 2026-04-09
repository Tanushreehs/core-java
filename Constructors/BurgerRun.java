class BurgerRun {

    String type;
    int price;

    BurgerRun(String type, int price) {
        this.type = type;
        this.price = price;
    }

    Burger info() {
        Burger burger = new Burger("Brown", this.type, this.price);
        return burger;
    }

    void show() {
        System.out.println("BurgerRun type : " + this.type);
        System.out.println("BurgerRun price : " + this.price);
    }
}