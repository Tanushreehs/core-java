class Locket {
    String material;
    String color;
    double weight;
    double price;
    String shape;
    String design;
    String brand;
    int size;
    boolean hasStone;
    String origin;
    Locket(String material, String color, double weight, double price, String shape,
           String design, String brand, int size, boolean hasStone, String origin) {

        this.material = material;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.shape = shape;
        this.design = design;
        this.brand = brand;
        this.size = size;
        this.hasStone = hasStone;
        this.origin = origin;
    }
    void display() {
        System.out.println(material + ", " + color + ", " + weight + ", " + price + ", " +
                shape + ", " + design + ", " + brand + ", " + size + ", " + hasStone + ", " + origin);
    }
}