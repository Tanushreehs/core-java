class StickRunner{
    public static void main(String[] args){

        Stick.stickInfo();
        System.out.println("\nUpdated values:\n");

        String type="Hockey";
        String color="Black";
        double length=90.0;
        double weight=1.5;

        Stick.stickInfo(type,color,length,weight);
    }
}