class Thread {

    static void threadInfo(){
        String type="Cotton";
        String color="White";
        String brand="Coats";
        String material="Fiber";
        double length=20.0;
        double thickness=1.0;
        int quantity=5;
        boolean isStrong=true;

        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Brand:"+brand);
        System.out.println("Material:"+material);
        System.out.println("Length:"+length);
        System.out.println("Thickness:"+thickness);
        System.out.println("Quantity:"+quantity);
        System.out.println("Strong:"+isStrong);
    }

    static void threadInfo(String type,String color,double length,double thickness){
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Length:"+length);
        System.out.println("Thickness:"+thickness);
    }
}