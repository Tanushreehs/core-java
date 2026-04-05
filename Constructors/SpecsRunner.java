class SpecsRunner {
    public static void main(String[] args) {

        Specs s1 = new Specs("RayBan", "Full Frame", "Anti-Glare", "Black",
                "Round", "Metal", "Unisex", 52, "Italy", 5000);

        Specs s2 = new Specs("Fastrack", "Half Frame", "Blue Cut", "Blue",
                "Square", "Plastic", "Men", 50, "India", 2500);

        Specs s3 = new Specs("Vincent Chase", "Rimless", "UV Protection", "Silver",
                "Oval", "Alloy", "Women", 48, "USA", 3500);

        s1.display();
        s2.display();
        s3.display();
    }
}