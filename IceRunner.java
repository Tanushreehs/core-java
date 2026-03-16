class IceRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Ice.details(-5,200,20,3,'C');
        System.out.println("\nExplicit declaration:\n");
        double temp=-3;
		double weight=250;
		int price=15;
		double size=2;
		char shape='S';
        Ice.details(temp,weight,price,size,shape);
	}
}