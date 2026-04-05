class Tyre {
    String brand;
    String type;
    String vehicleType;
    String material;
    String pattern;
    String sizeType;
    String origin;
    String condition;
    int width;
    double price;
    Tyre(String brand, String type, String vehicleType, String material,
         String pattern, String sizeType, String origin, String condition,
         int width, double price) {

        this.brand = brand;
        this.type = type;
        this.vehicleType = vehicleType;
        this.material = material;
        this.pattern = pattern;
        this.sizeType = sizeType;
        this.origin = origin;
        this.condition = condition;
        this.width = width;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + type + "," + vehicleType + "," + material + "," +
                pattern + "," + sizeType + "," + origin + "," + condition + "," +
                width + "," + price);
    }
}