class Chip{

    static void chipInfo(){
        String brand="Intel";
        String type="Processor";
        String color="Black";
        String material="Silicon";
        double size=2.0;
        double weight=0.5;
        int cores=8;
        boolean isElectronic=true;

        System.out.println("Brand:"+brand);
        System.out.println("Type:"+type);
        System.out.println("Color:"+color);
        System.out.println("Material:"+material);
        System.out.println("Size:"+size);
        System.out.println("Weight:"+weight);
        System.out.println("Cores:"+cores);
        System.out.println("Electronic:"+isElectronic);
    }

    static void chipInfo(String brand,String type,double size,double weight){
        System.out.println("Brand:"+brand);
        System.out.println("Type:"+type);
        System.out.println("Size:"+size);
        System.out.println("Weight:"+weight);
    }
}