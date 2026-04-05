class Boomer {
    String brand;
    String flavor;
    String color;
    String shape;
    String type;
    String packaging;
    String origin;
    String manufacturer;
    int quantity;
    double price;
    Boomer(String brand, String flavor, String color, String shape,
           String type, String packaging, String origin, String manufacturer,
           int quantity, double price) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.shape = shape;
        this.type = type;
        this.packaging = packaging;
        this.origin = origin;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + flavor + "," + color + "," + shape + "," +
                type + "," + packaging + "," + origin + "," + manufacturer + "," +
                quantity + "," + price);
    }
}