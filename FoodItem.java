class FoodItem {

    static int getPrice(String item){

        if(item.equals("Dosa")){
            System.out.println("Dosa price = 40");
            return 40;
        }
        if(item.equals("Idli")){
            System.out.println("Idli price = 30");
            return 30;
        }
        if(item.equals("Biryani")){
            System.out.println("Biryani price = 120");
            return 120;
        }
        if(item.equals("Pizza")){
            System.out.println("Pizza price = 200");
            return 200;
        }
        if(item.equals("Coffee")){
            System.out.println("Coffee price = 20");
            return 20;
        }

        System.out.println("Food item not available");
        return 0;
    }
}