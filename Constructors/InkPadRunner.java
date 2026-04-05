class InkPadRunner {
    public static void main(String[] args) {

        InkPad i1 = new InkPad("Camel", "Blue", "Stamp Ink", "Foam",
                "Rectangle", "Office", "Box", "India", 5, 50.0);

        InkPad i2 = new InkPad("FaberCastell", "Black", "Stamp Ink", "Sponge",
                "Square", "School", "Packet", "Germany", 4, 60.0);

        InkPad i3 = new InkPad("Doms", "Red", "Stamp Ink", "Foam",
                "Rectangle", "Office", "Box", "India", 6, 55.0);

        i1.display();
        i2.display();
        i3.display();
    }
}