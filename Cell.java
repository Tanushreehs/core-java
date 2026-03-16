class Cell{

    static void cellInfo(){
        String type="Battery";
        String brand="Duracell";
        String color="Black";
        String shape="Cylinder";
        double voltage=1.5;
        double weight=0.3;
        int capacity=2000;
        boolean isRechargeable=false;

        System.out.println("Type:"+type);
        System.out.println("Brand:"+brand);
        System.out.println("Color:"+color);
        System.out.println("Shape:"+shape);
        System.out.println("Voltage:"+voltage);
        System.out.println("Weight:"+weight);
        System.out.println("Capacity:"+capacity);
        System.out.println("Rechargeable:"+isRechargeable);
    }

    static void cellInfo(String type,String brand,double voltage,double weight){
        System.out.println("Type:"+type);
        System.out.println("Brand:"+brand);
        System.out.println("Voltage:"+voltage);
        System.out.println("Weight:"+weight);
    }
}