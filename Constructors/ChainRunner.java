class ChainRunner {
    public static void main(String[] args) {

        Chain c1 = new Chain("Gold", "Yellow", "Traditional", "Tanishq",
                "Neck Chain", "India", 20.5, 75000, 18, true);

        Chain c2 = new Chain("Silver", "White", "Modern", "Malabar",
                "Light Chain", "India", 15.0, 25000, 16, false);

        Chain c3 = new Chain("Platinum", "Grey", "Designer", "Kalyan",
                "Premium Chain", "USA", 18.2, 90000, 20, true);

        c1.display();
        c2.display();
        c3.display();
    }
}