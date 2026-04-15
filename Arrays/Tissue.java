class Tissue{
	String brand;
	String type;
	int plyCount;
	String material;
	int packSize;
	double price;
	String color;
	boolean isScented;
	String usage;
	String origin;
	Tissue(String brand,String type,int plyCount,String material,int packSize,double price,String color,boolean isScented,String usage,String origin){
		this.brand=brand;
		this.type=type;
		this.plyCount=plyCount;
		this.material=material;
		this.packSize=packSize;
		this.price=price;
		this.color=color;
		this.isScented=isScented;
		this.usage=usage;
		this.origin=origin;
	}
	 void show(){
		System.out.println("Brand :"+this.brand);
		System.out.println("Type :"+this.type);
		System.out.println("Ply Count :"+this.plyCount);
		System.out.println("Material :"+this.material);
		System.out.println("Pack Size :"+this.packSize);
		System.out.println("Price :"+this.price);
		System.out.println("Color :"+this.color);
		System.out.println("Scented :"+this.isScented);
		System.out.println("Usage :"+this.usage);
		System.out.println("Origin :"+this.origin);
		System.out.println("============================");
	}
}