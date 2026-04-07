class Monitor {

    int size;
    String brand;

    Monitor(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    void show() {
        System.out.println("Size: " + this.size);
        System.out.println("Brand: " + this.brand);
    }
}