class Screw{

    static void screwInfo(){
        String material="Steel";
        String type="Phillips";
        String color="Silver";
        String brand="Bosch";
        double length=5.0;
        double diameter=1.0;
        int quantity=10;
        boolean isRustFree=true;

        System.out.println("Material:"+material);
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Brand:"+brand);
        System.out.println("Length:"+length);
        System.out.println("Diameter:"+diameter);
        System.out.println("Quantity:"+quantity);
        System.out.println("Rust Free:"+isRustFree);
    }

    static void screwInfo(String material,String type,double length,double diameter){
        System.out.println("Material:"+material);
        System.out.println("Type:"+type);
        System.out.println("Length:"+length);
        System.out.println("Diameter:"+diameter);
    }
}