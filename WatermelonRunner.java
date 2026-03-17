class WatermelonRunner {

    public static void main(String[] args) {

        System.out.println("Testing Watermelon:");

        int price = Watermelon.getPrice(2);
        System.out.println("Returned Price: " + price);

        Watermelon.getPrice(20); 
    }
}