class Stamp {
    String brand;
    String type;
    String shape;
    String material;
    String inkColor;
    String usage;
    String design;
    String origin;
    int size;
    double price;
    Stamp(String brand, String type, String shape, String material,
          String inkColor, String usage, String design, String origin,
          int size, double price) {

        this.brand = brand;
        this.type = type;
        this.shape = shape;
        this.material = material;
        this.inkColor = inkColor;
        this.usage = usage;
        this.design = design;
        this.origin = origin;
        this.size = size;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + type + "," + shape + "," + material + "," +
                inkColor + "," + usage + "," + design + "," + origin + "," +
                size + "," + price);
    }
}