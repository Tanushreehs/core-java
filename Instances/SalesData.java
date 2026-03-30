class SalesData {
    public static void main(String[] args) {

        int[] sales = {100, 200, 150, 300, 250, 400, 350};
        int total = 0;
        int max = sales[0];
        int day = 1;

        for(int i = 0; i < sales.length; i++) {
            total += sales[i];

            if(sales[i] > max) {
                max = sales[i];
                day = i + 1;
            }
        }

        System.out.println("Total Sales: " + total);
        System.out.println("Highest Sale: " + max);
        System.out.println("Day: " + day);
    }
}