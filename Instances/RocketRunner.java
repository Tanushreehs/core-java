class RocketRunner {
    public static void main(String[] args) {

        Rocket r1 = new Rocket("PSLV", "India", "Launch Vehicle", "Solid/Liquid",
                "ISRO", "Satellite Launch", "Sriharikota", "Active", 4, 320.0);

        Rocket r2 = new Rocket("Falcon 9", "USA", "Reusable Rocket", "Liquid",
                "SpaceX", "Cargo & Crew", "Florida", "Active", 2, 549.0);

        Rocket r3 = new Rocket("GSLV", "India", "Heavy Lift", "Cryogenic",
                "ISRO", "Satellite Launch", "Sriharikota", "Active", 3, 414.0);

        r1.display();
        r2.display();
        r3.display();
    }
}