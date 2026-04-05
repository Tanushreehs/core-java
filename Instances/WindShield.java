class WindShield {
    String brand;
    String vehicleType;
    String material;
    String type;
    String shape;
    String color;
    String origin;
    String condition;
    int size;
    double price;
    WindShield(String brand, String vehicleType, String material, String type,
               String shape, String color, String origin, String condition,
               int size, double price) {

        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.type = type;
        this.shape = shape;
        this.color = color;
        this.origin = origin;
        this.condition = condition;
        this.size = size;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + vehicleType + "," + material + "," + type + "," +
                shape + "," + color + "," + origin + "," + condition + "," +
                size + "," + price);
    }
}