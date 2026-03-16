class Toy {

    static void toyInfo() {

        String name = "Car";
        String color = "Red";
        String brand = "HotWheels";
        String material = "Plastic";
        double price = 200.0;
        double weight = 0.5;
        int quantity = 10;
        boolean isBatteryOperated = false;

        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Quantity: " + quantity);
        System.out.println("Battery Operated: " + isBatteryOperated);
    }

    static void toyInfo(String name, String color, double price, double weight) {

        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
    }
}