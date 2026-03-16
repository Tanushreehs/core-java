class LeafRunner{
    public static void main(String[] args){

        Leaf.leafInfo();
        System.out.println("\nUpdated values:\n");

        String type="Neem";
        String color="Dark Green";
        double size=6.0;
        double weight=0.1;

        Leaf.leafInfo(type,color,size,weight);
    }
}