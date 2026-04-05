class Chain {
    String material, color, design, brand, type, origin;
    double weight, price;
    int length;
    boolean isGold;

    Chain(String material, String color, String design, String brand, String type,
          String origin, double weight, double price, int length, boolean isGold) {

        this.material = material;
        this.color = color;
        this.design = design;
        this.brand = brand;
        this.type = type;
        this.origin = origin;
        this.weight = weight;
        this.price = price;
        this.length = length;
        this.isGold = isGold;
    }

    void display() {
        System.out.println(material + "," + color + "," + design + "," + brand + "," +
                type + "," + origin + "," + weight + "," + price + "," + length + "," + isGold);
    }
}