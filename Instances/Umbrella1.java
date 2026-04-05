class Umbrella1 {
    String brand;
    String color;
    String material;
    String type;
    String handleType;
    String shape;
    String origin;
    String usage;
    int length;
    double price;
    Umbrella1(String brand, String color, String material, String type,
             String handleType, String shape, String origin, String usage,
             int length, double price) {

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.handleType = handleType;
        this.shape = shape;
        this.origin = origin;
        this.usage = usage;
        this.length = length;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + color + "," + material + "," + type + "," +
                handleType + "," + shape + "," + origin + "," + usage + "," +
                length + "," + price);
    }
}