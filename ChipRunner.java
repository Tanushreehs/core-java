class ChipRunner{
    public static void main(String[] args){

        Chip.chipInfo();
        System.out.println("\nUpdated values:\n");

        String brand="AMD";
        String type="Microchip";
        double size=3.0;
        double weight=0.7;

        Chip.chipInfo(brand,type,size,weight);
    }
}