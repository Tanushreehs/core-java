class GraphicCard {

    String brand = "NVIDIA";
    String color = "Black";
    int memory = 8;
    String type = "GPU";
    boolean supportsRayTracing = true;

    double price;
    String model;
    int cores;
    double clockSpeed;
    String architecture;
    boolean isAvailable;
    int warranty;
    String coolingType;
    double weight;
    String compatibility;

    public GraphicCard() {
        System.out.println("GraphicCard details:");
    }
}