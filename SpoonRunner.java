class SpoonRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Spoon.details(18,25.5,2.5,50,'S');
        System.out.println("\nExplicit declaration:\n");
        int length=20;
		double weight=30;
		double thickness=3;
		int price=40;
		char type='P';
        Spoon.details(length,weight,thickness,price,type);
	}
}