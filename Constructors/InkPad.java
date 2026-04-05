class InkPad {
    String brand;
    String color;
    String type;
    String material;
    String shape;
    String usage;
    String packaging;
    String origin;
    int size;
    double price;
    InkPad(String brand, String color, String type, String material,
           String shape, String usage, String packaging, String origin,
           int size, double price) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.material = material;
        this.shape = shape;
        this.usage = usage;
        this.packaging = packaging;
        this.origin = origin;
        this.size = size;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + color + "," + type + "," + material + "," +
                shape + "," + usage + "," + packaging + "," + origin + "," +
                size + "," + price);
    }
}