class KeyRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Key.details(6,20,50,2,'D');
        System.out.println("\nExplicit declaration:\n");
        double length=5;
		double weight=15;
		int price=40;
		double thickness=2;
		char type='L';
        Key.details(length,weight,price,thickness,type);
	}
}