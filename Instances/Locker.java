class Locker {
    String brand;
    String material;
    String color;
    String type;
    String lockType;
    String location;
    String shape;
    String origin;
    int capacity;
    double price;
    Locker(String brand, String material, String color, String type,
           String lockType, String location, String shape, String origin,
           int capacity, double price) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.lockType = lockType;
        this.location = location;
        this.shape = shape;
        this.origin = origin;
        this.capacity = capacity;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + material + "," + color + "," + type + "," +
                lockType + "," + location + "," + shape + "," + origin + "," +
                capacity + "," + price);
    }
}