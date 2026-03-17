class TissuePaperRunner {

    public static void main(String[] args) {

        System.out.println("Testing Tissue Paper:");

        int price = TissuePaper.getPriceByThickness(3);
        System.out.println("Returned Price: " + price);

        TissuePaper.getPriceByThickness(20); 
    }
}