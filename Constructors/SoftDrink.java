class SoftDrink {
    String brand;
    String flavor;
    String color;
    String type;
    String packaging;
    String manufacturer;
    String origin;
    String expiryDate;
    int quantity;
    double price;
    SoftDrink(String brand, String flavor, String color, String type,
              String packaging, String manufacturer, String origin,
              String expiryDate, int quantity, double price) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.type = type;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.origin = origin;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.price = price;
    }
    void display() {
        System.out.println(brand + "," + flavor + "," + color + "," + type + "," +
                packaging + "," + manufacturer + "," + origin + "," +
                expiryDate + "," + quantity + "," + price);
    }
}