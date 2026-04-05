class ThinkPad {
    String brand;
    String model;
    String processor;
    String operatingSystem;
    String color;
    String type;
    String storageType;
    String origin;
    int ram;
    double price;
    ThinkPad(String brand, String model, String processor, String operatingSystem,
             String color, String type, String storageType, String origin,
             int ram, double price) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.type = type;
        this.storageType = storageType;
        this.origin = origin;
        this.ram = ram;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + model + "," + processor + "," +
                operatingSystem + "," + color + "," + type + "," +
                storageType + "," + origin + "," + ram + "," + price);
    }
}