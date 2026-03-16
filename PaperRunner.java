class PaperRunner{
	public static void main(String[] args){
        System.out.println("\nImplicit declaration:\n");
		Paper.details(29.7,21,100,200,'A');
		System.out.println("\nExplicit declaration:\n");
        double length=30;
		double width=22;
		int pages=200;
		int price=150;
		char type='N';
        Paper.details(length,width,pages,price,type);
	}
}