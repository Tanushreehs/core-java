class BoomerRunner {
    public static void main(String[] args) {

        Boomer b1 = new Boomer("Boomer", "Strawberry", "Pink", "Cube",
                "Bubble Gum", "Wrapper", "India", "Wrigley", 10, 5.0);

        Boomer b2 = new Boomer("Boomer", "Mint", "Green", "Cube",
                "Chewing Gum", "Box", "India", "Wrigley", 20, 10.0);

        Boomer b3 = new Boomer("Boomer", "Orange", "Orange", "Cube",
                "Bubble Gum", "Packet", "India", "Wrigley", 15, 7.5);

        b1.display();
        b2.display();
        b3.display();
    }
}