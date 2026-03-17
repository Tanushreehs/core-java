class TyreRunner {

    public static void main(String[] args) {

        System.out.println("Testing Tyre:");

        int price = Tyre.getPrice("MRF", 15);
        System.out.println("Returned Price: " + price);

        Tyre.getPrice("XYZ", 10); 
    }
}