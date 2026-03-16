class CoffeeRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Coffee.details(80,150,2,120,'E');
        System.out.println("\nExplicit declaration:\n");
        double temp=75;
		double qty=200;
		int sugar=3;
		int price=180;
		char type='C';
        Coffee.details(temp,qty,sugar,price,type);
	}
}