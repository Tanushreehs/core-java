class TissuePaper {

    static int getPriceByThickness(int thickness) {

        if(thickness == 1){
            System.out.println("price = 10");
            return 10;
        }
        if(thickness == 2){
            System.out.println("price = 20");
            return 20;
        }
        if(thickness == 3){
            System.out.println("price = 30");
            return 30;
        }
        if(thickness == 4){
            System.out.println("price = 40");
            return 40;
        }
        if(thickness == 5){
            System.out.println("price = 50");
            return 50;
        }

        System.out.println("Thickness not available");
        return 0;
    }
}