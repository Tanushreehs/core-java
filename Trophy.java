class Trophy{

    static void trophyInfo(){
        String material="Gold";
        String event="Sports";
        String color="Golden";
        String brand="AwardCo";
        double height=30.0;
        double weight=2.0;
        int year=2024;
        boolean isShiny=true;

        System.out.println("Material:"+material);
        System.out.println("Event:"+event);
        System.out.println("Color:"+color);
        System.out.println("Brand:"+brand);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
        System.out.println("Year:"+year);
        System.out.println("Shiny:"+isShiny);
    }

    static void trophyInfo(String material,String event,double height,double weight){
        System.out.println("Material:"+material);
        System.out.println("Event:"+event);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
    }
}