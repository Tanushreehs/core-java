class ThreadRunner{
    public static void main(String[] args){

        Thread.threadInfo();
        System.out.println("\nUpdated values:\n");

        String type="Silk";
        String color="Red";
        double length=30.0;
        double thickness=1.2;

        Thread.threadInfo(type,color,length,thickness);
    }
}