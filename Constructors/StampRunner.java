class StampRunner {
    public static void main(String[] args) {

        Stamp s1 = new Stamp("Trodat", "Rubber Stamp", "Rectangle", "Rubber",
                "Blue", "Office", "Approved", "Austria", 5, 300.0);

        Stamp s2 = new Stamp("Shiny", "Self Ink", "Square", "Plastic",
                "Black", "School", "Verified", "Taiwan", 4, 250.0);

        Stamp s3 = new Stamp("Deli", "Manual Stamp", "Round", "Wood",
                "Red", "Office", "Paid", "China", 6, 200.0);

        s1.display();
        s2.display();
        s3.display();
    }
}