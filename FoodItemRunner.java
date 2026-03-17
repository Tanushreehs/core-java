class FoodItemRunner {

    public static void main(String[] args) {

        System.out.println("Testing Food Items:");

        int price = FoodItem.getPrice("Dosa");
        System.out.println("Returned Price: " + price);

        FoodItem.getPrice("PaniPuri"); 
    }
}