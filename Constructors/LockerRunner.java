class LockerRunner {
    public static void main(String[] args) {

        Locker l1 = new Locker("Godrej", "Steel", "Grey", "Office",
                "Digital", "Room", "Rectangle", "India", 50, 15000);

        Locker l2 = new Locker("Samsung", "Alloy", "Black", "Home",
                "Key Lock", "Bedroom", "Square", "Korea", 30, 12000);

        Locker l3 = new Locker("Yale", "Metal", "White", "Bank",
                "Biometric", "Vault", "Rectangle", "USA", 100, 50000);

        l1.display();
        l2.display();
        l3.display();
    }
}