class Tyre {

    static int getPrice(String brand, int size) {

        if(brand.equals("MRF") && size == 15){
            System.out.println("MRF tyre size 15 selected, price = 3000");
            return 3000;
        }
        if(brand.equals("CEAT") && size == 16){
            System.out.println("CEAT tyre size 16 selected, price = 3300");
            return 3300;
        }
        if(brand.equals("Apollo") && size == 15){
            System.out.println("Apollo tyre size 15 selected, price = 2900");
            return 2900;
        }
        if(brand.equals("JK") && size == 16){
            System.out.println("JK tyre size 16 selected, price = 3200");
            return 3200;
        }
        if(brand.equals("Michelin") && size == 15){
            System.out.println("Michelin tyre size 15 selected, price = 4200");
            return 4200;
        }

        System.out.println("Tyre not found for given brand and size");
        return 0;
    }
}