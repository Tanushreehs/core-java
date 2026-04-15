class Broccoli{
	String color;
	double weight;
	String type;
	String taste;
	boolean isOrganic;
	double pricePerKg;
	String origin;
	boolean isFresh;
	double length;
	String quality;
    Broccoli(String color,double weight,String type,String taste,boolean isOrganic,double pricePerKg,String origin,boolean isFresh,double length,String quality){
		this.color=color;
		this.weight=weight;
		this.type=type;
		this.taste=taste;
		this.isOrganic=isOrganic;
		this.pricePerKg=pricePerKg;
		this.origin=origin;
		this.isFresh=isFresh;
		this.length=length;
		this.quality=quality;
	}
    void show(){
		System.out.println("Color :"+this.color);
		System.out.println("Weight :"+this.weight);
		System.out.println("Type :"+this.type);
		System.out.println("Taste :"+this.taste);
		System.out.println("Organic :"+this.isOrganic);
		System.out.println("Price per KG :"+this.pricePerKg);
		System.out.println("Origin :"+this.origin);
		System.out.println("Fresh :"+this.isFresh);
		System.out.println("Length :"+this.length);
		System.out.println("Quality :"+this.quality);
		System.out.println("============================");
	}
}