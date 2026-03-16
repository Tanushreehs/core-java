class RingRunner{
	public static void main(String[] args){

		System.out.println("\nImplicit declaration:\n");
		Ring.details(7,4.5,2,20000,'G');

		System.out.println("\nExplicit declaration:\n");

		int size=8;
		double weight=5;
		double thickness=2;
		int price=15000;
		char material='S';

		Ring.details(size,weight,thickness,price,material);
	}
}