class Leaf{

    static void leafInfo(){
        String type="Mango";
        String color="Green";
        String shape="Oval";
        String plant="Tree";
        double size=8.0;
        double weight=0.2;
        int quantity=15;
        boolean isFresh=true;

        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Shape:"+shape);
        System.out.println("Plant:"+plant);
        System.out.println("Size:"+size);
        System.out.println("Weight:"+weight);
        System.out.println("Quantity:"+quantity);
        System.out.println("Fresh:"+isFresh);
    }

    static void leafInfo(String type,String color,double size,double weight){
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Size:"+size);
        System.out.println("Weight:"+weight);
    }
}