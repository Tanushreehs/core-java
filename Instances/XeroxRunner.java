class XeroxRunner {
    public static void main(String[] args) {

        Xerox x1 = new Xerox("Canon", "IR2206", "Photocopier", "Black & White",
                "A4", "USB", "Office", "Japan", 20, 45000);

        Xerox x2 = new Xerox("HP", "LaserJet Pro", "Printer", "Color",
                "A4", "WiFi", "Home", "USA", 18, 30000);

        Xerox x3 = new Xerox("Epson", "EcoTank", "Printer", "Color",
                "A3", "Wireless", "Shop", "Japan", 25, 55000);

        x1.display();
        x2.display();
        x3.display();
    }
}