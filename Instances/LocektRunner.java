class LocketRunner {
    public static void main(String[] args) {

        Locket l1 = new Locket("Gold", "Yellow", 10.5, 15000, "Heart", "Floral", "Tanishq", 5, true, "India");
        Locket l2 = new Locket("Silver", "White", 8.2, 5000, "Oval", "Plain", "Malabar", 4, false, "India");
        Locket l3 = new Locket("Platinum", "Grey", 9.0, 20000, "Round", "Modern", "Kalyan", 6, true, "USA");

        l1.display();
        l2.display();
        l3.display();
    }
}