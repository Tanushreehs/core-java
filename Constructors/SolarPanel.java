class SolarPanel {

    int capacity;
    String brand;

    SolarPanel(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    void show() {
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Brand: " + this.brand);
    }
}