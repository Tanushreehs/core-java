public class Adapter {
    public static void main(String[] args) {
        String brand = "Apple";
        int wattage = 20;
        String portType = "USB-C";
        double weight = 50.5;
        boolean isOriginal = true;

        System.out.println("Brand: " + brand);
        System.out.println("Wattage: " + wattage);
        System.out.println("Port: " + portType);
        System.out.println("Weight: " + weight);
        System.out.println("Original: " + isOriginal);

        brand = "Samsung";
        wattage = 45;
        portType = "USB-A";
        weight = 65.0;
        isOriginal = false;

        System.out.println("New Brand: " + brand);
        System.out.println("New Wattage: " + wattage);
        System.out.println("New Port: " + portType);
        System.out.println("New Weight: " + weight);
        System.out.println("New Original: " + isOriginal);
    }
}