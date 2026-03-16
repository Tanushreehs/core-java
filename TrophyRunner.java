class TrophyRunner{
    public static void main(String[] args){

        Trophy.trophyInfo();
        System.out.println("\nUpdated values:\n");

        String material="Silver";
        String event="Dance";
        double height=25.0;
        double weight=1.5;

        Trophy.trophyInfo(material,event,height,weight);
    }
}