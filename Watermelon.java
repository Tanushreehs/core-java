class Watermelon {

    static int getPrice(int quantity) {

        if(quantity == 1){
            System.out.println("1 watermelon price = 50");
            return 50;
        }
        if(quantity == 2){
            System.out.println("2 watermelons price = 100");
            return 100;
        }
        if(quantity == 3){
            System.out.println("3 watermelons price = 150");
            return 150;
        }
        if(quantity == 4){
            System.out.println("4 watermelons price = 200");
            return 200;
        }
        if(quantity == 5){
            System.out.println("5 watermelons price = 250");
            return 250;
        }

        System.out.println("Invalid quantity entered");
        return 0;
    }
}