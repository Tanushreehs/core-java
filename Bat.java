class Bat{

    static void batInfo(){
        String type="Cricket";
        String brand="MRF";
        String material="Wood";
        String color="Brown";
        double weight=1.2;
        double length=85.0;
        int price=3000;
        boolean isProfessional=true;

        System.out.println("Type:"+type);
        System.out.println("Brand:"+brand);
        System.out.println("Material:"+material);
        System.out.println("Color:"+color);
        System.out.println("Weight:"+weight);
        System.out.println("Length:"+length);
        System.out.println("Price:"+price);
        System.out.println("Professional:"+isProfessional);
    }

    static void batInfo(String type,String brand,double weight,double length){
        System.out.println("Type:"+type);
        System.out.println("Brand:"+brand);
        System.out.println("Weight:"+weight);
        System.out.println("Length:"+length);
    }
}