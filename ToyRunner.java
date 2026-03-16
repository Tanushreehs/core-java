class ToyRunner {
    public static void main(String[] args) {

        Toy.toyInfo();
        System.out.println("\nUpdated values:\n");

        String name = "Robot";
        String color = "Blue";
        double price = 500.0;
        double weight = 1.2;

        Toy.toyInfo(name, color, price, weight);
    }
}