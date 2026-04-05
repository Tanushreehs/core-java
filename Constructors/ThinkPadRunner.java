class ThinkPadRunner {
    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad("Lenovo", "E14", "Intel i5", "Windows 11",
                "Black", "Laptop", "SSD", "China", 8, 60000.0);

        ThinkPad t2 = new ThinkPad("Lenovo", "X1 Carbon", "Intel i7", "Windows 11",
                "Black", "Ultrabook", "SSD", "USA", 16, 120000.0);

        ThinkPad t3 = new ThinkPad("Lenovo", "L15", "AMD Ryzen 5", "Windows 10",
                "Black", "Laptop", "SSD", "India", 8, 55000.0);

        t1.display();
        t2.display();
        t3.display();
    }
}