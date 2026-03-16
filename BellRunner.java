class BellRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Bell.details(500,20,300,6,'B');
        System.out.println("\nExplicit declaration:\n");
        double weight=600;
		double height=25;
		int price=250;
		double radius=7;
		char material='I';
        Bell.details(weight,height,price,radius,material);
	}
}