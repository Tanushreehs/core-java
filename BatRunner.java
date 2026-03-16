class BatRunner{
    public static void main(String[] args){

        Bat.batInfo();
        System.out.println("\nUpdated values:\n");

        String type="Baseball";
        String brand="Nike";
        double weight=1.0;
        double length=80.0;

        Bat.batInfo(type,brand,weight,length);
    }
}