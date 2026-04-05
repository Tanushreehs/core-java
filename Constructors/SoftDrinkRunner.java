class SoftDrinkRunner {
    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink("CocaCola", "Cola", "Brown", "Carbonated",
                "Bottle", "CocaCola Company", "USA", "12-2026", 750, 40.0);

        SoftDrink s2 = new SoftDrink("Pepsi", "Cola", "Dark Brown", "Carbonated",
                "Can", "PepsiCo", "USA", "11-2026", 500, 35.0);

        SoftDrink s3 = new SoftDrink("Fanta", "Orange", "Orange", "Carbonated",
                "Bottle", "CocaCola Company", "India", "10-2026", 1000, 45.0);

        s1.display();
        s2.display();
        s3.display();
    }
}