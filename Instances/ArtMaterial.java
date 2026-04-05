class ArtMaterial {
    String brand;
    String type;
    String color;
    String material;
    String usage;
    String quality;
    String packaging;
    String origin;
    int quantity;
    double price;
    ArtMaterial(String brand, String type, String color, String material,
                String usage, String quality, String packaging, String origin,
                int quantity, double price) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.usage = usage;
        this.quality = quality;
        this.packaging = packaging;
        this.origin = origin;
        this.quantity = quantity;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + type + "," + color + "," + material + "," +
                usage + "," + quality + "," + packaging + "," + origin + "," +
                quantity + "," + price);
    }
}