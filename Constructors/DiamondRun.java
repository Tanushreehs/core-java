class DiamondRun {

    String type;
    int price;

    DiamondRun(String type, int price) {
        this.type = type;
        this.price = price;
    }

    Diamond info() {
        Diamond diamond = new Diamond("White", this.type, this.price);
        return diamond;
    }

    void show() {
        System.out.println("DiamondRun type : " + this.type);
        System.out.println("DiamondRun price : " + this.price);
    }
}