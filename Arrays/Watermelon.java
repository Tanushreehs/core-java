class Watermelon{
	String color;
	double weight;
	String shape;
	boolean isSeedless;
	String taste;
	int seedCount;
	double pricePerKg;
	String origin;
	boolean isRipe;
	double diameter;
	
	Watermelon(String color,double weight,String shape,boolean isSeedless,String taste,int seedCount,double pricePerKg,String origin,boolean isRipe,double diameter){
		this.color=color;
		this.weight=weight;
		this.shape=shape;
		this.isSeedless=isSeedless;
		this.taste=taste;
		this.seedCount=seedCount;
		this.pricePerKg=pricePerKg;
		this.origin=origin;
		this.isRipe=isRipe;
		this.diameter=diameter;
		
	}
	void show(){
		System.out.println("Color :"+this.color);
		System.out.println("Weight :"+this.weight);
		System.out.println("Shape :"+this.shape);
		System.out.println("isSeedless :"+this.isSeedless);
		System.out.println("taste :"+this.taste);
		System.out.println("Seed Count :"+this.seedCount);
		System.out.println("Price per KG :"+this.pricePerKg);
		System.out.println("Origin :"+this.origin);
		System.out.println("Is ripe :"+this.isRipe);
		System.out.println("diameter :"+this.diameter);
		System.out.println("============================");
	}
}