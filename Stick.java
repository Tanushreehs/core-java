class Stick{

    static void stickInfo(){
        String type="Wood";
        String color="Brown";
        String material="Bamboo";
        String brand="Local";
        double length=50.0;
        double weight=0.8;
        int quantity=3;
        boolean isStrong=true;

        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Brand:"+brand);
        System.out.println("Length:"+length);
        System.out.println("Weight:"+weight);
        System.out.println("Quantity:"+quantity);
        System.out.println("Strong:"+isStrong);
    }

    static void stickInfo(String type,String color,double length,double weight){
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Length:"+length);
        System.out.println("Weight:"+weight);
    }
}