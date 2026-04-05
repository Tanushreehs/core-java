class Xerox {
    String brand;
    String model;
    String type;
    String colorMode;
    String paperSize;
    String connectivity;
    String location;
    String origin;
    int speed;
    double price;
    Xerox(String brand, String model, String type, String colorMode,
          String paperSize, String connectivity, String location,
          String origin, int speed, double price) {

        this.brand = brand;
        this.model = model;
        this.type = type;
        this.colorMode = colorMode;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.location = location;
        this.origin = origin;
        this.speed = speed;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + model + "," + type + "," + colorMode + "," +
                paperSize + "," + connectivity + "," + location + "," +
                origin + "," + speed + "," + price);
    }
}