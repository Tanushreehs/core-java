class CellRunner{
    public static void main(String[] args){

        Cell.cellInfo();
        System.out.println("\nUpdated values:\n");

        String type="Lithium";
        String brand="Sony";
        double voltage=3.0;
        double weight=0.4;

        Cell.cellInfo(type,brand,voltage,weight);
    }
}