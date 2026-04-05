class WindShieldRunner {
    public static void main(String[] args) {

        WindShield w1 = new WindShield("SaintGobain", "Car", "Glass", "Front",
                "Curved", "Transparent", "India", "New", 120, 7000.0);

        WindShield w2 = new WindShield("Asahi", "Bike", "Glass", "Front",
                "Flat", "Clear", "Japan", "New", 60, 2500.0);

        WindShield w3 = new WindShield("Guardian", "Truck", "Laminated Glass", "Front",
                "Rectangle", "Transparent", "USA", "New", 150, 9000.0);

        w1.display();
        w2.display();
        w3.display();
    }
}