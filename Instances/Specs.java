class Specs {
    String brand, frameType, lensType, color, shape, material, gender, origin;
	int size;
    double price;

    Specs(String brand, String frameType, String lensType, String color, String shape,
          String material, String gender, int size, String origin, double price) {

        this.brand = brand;
        this.frameType = frameType;
        this.lensType = lensType;
        this.color = color;
        this.shape = shape;
        this.material = material;
        this.gender = gender;
        this.size = size;
        this.origin = origin;
        this.price = price;
    }

    void display() {
        System.out.println(brand + "," + frameType + "," + lensType + "," + color + "," +
                shape + "," + material + "," + gender + "," + size + "," + origin + "," + price);
    }
}