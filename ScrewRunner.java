class ScrewRunner{
    public static void main(String[] args){

        Screw.screwInfo();
        System.out.println("\nUpdated values:\n");

        String material="Iron";
        String type="Flat";
        double length=6.0;
        double diameter=1.5;

        Screw.screwInfo(material,type,length,diameter);
    }
}