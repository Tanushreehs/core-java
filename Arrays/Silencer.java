class Silencer{
	String brand;
	String material;
	double weight;
	String type;
	double length;
	double price;
	String vehicleType;
	boolean isHeatResistant;
	String color;
	int warrantyYears;
	Silencer(String brand,String material,double weight,String type,double length,double price,String vehicleType,boolean isHeatResistant,String color,int warrantyYears){
		this.brand=brand;
		this.material=material;
		this.weight=weight;
		this.type=type;
		this.length=length;
		this.price=price;
		this.vehicleType=vehicleType;
		this.isHeatResistant=isHeatResistant;
		this.color=color;
		this.warrantyYears=warrantyYears;
	}
	void show(){
		System.out.println("Brand :"+this.brand);
		System.out.println("Material :"+this.material);
		System.out.println("Weight :"+this.weight);
		System.out.println("Type :"+this.type);
		System.out.println("Length :"+this.length);
		System.out.println("Price :"+this.price);
		System.out.println("Vehicle Type :"+this.vehicleType);
		System.out.println("Heat Resistant :"+this.isHeatResistant);
		System.out.println("Color :"+this.color);
		System.out.println("Warranty Years :"+this.warrantyYears);
		System.out.println("============================");
	}
}