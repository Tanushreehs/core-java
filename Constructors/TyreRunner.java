class TyreRunner {
    public static void main(String[] args) {

        Tyre t1 = new Tyre("MRF", "Tubeless", "Car", "Rubber",
                "Radial", "Medium", "India", "New", 185, 5000.0);

        Tyre t2 = new Tyre("Apollo", "Tube", "Bike", "Rubber",
                "Block", "Small", "India", "New", 120, 2500.0);

        Tyre t3 = new Tyre("Michelin", "Tubeless", "SUV", "Synthetic",
                "AllTerrain", "Large", "France", "New", 215, 8000.0);

        t1.display();
        t2.display();
        t3.display();
    }
}