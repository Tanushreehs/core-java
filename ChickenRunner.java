class ChickenRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Chicken.details(2,450,8,4,'B');
		System.out.println("\nExplicit declaration:\n");
        double weight=1.5;
		int price=500;
		int pieces=10;
		double size=5;
		char type='C';
        Chicken.details(weight,price,pieces,size,type);
	}
}