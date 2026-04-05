class UmbrellaRunner1 {
    public static void main(String[] args) {

        Umbrella1 u1 = new Umbrella1("Popy", "Black", "Polyester", "Foldable",
                "Plastic", "Round", "India", "Rain", 60, 500.0);

        Umbrella1 u2 = new Umbrella1("Johns", "Blue", "Nylon", "Straight",
                "Wood", "Round", "USA", "Sun & Rain", 70, 800.0);

        Umbrella1 u3 = new Umbrella1("Skybags", "Red", "Polyester", "Compact",
                "Rubber", "Round", "India", "Rain", 55, 650.0);

        u1.display();
        u2.display();
        u3.display();
    }
}