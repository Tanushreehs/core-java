class Glove{
	String type;
	String material;
	String size;
	String color;
	String brand;
	double price;
	boolean isWaterproof;
	String usage;
	String origin;
	double weight;
    Glove(String type,String material,String size,String color,String brand,double price,boolean isWaterproof,String usage,String origin,double weight){
		this.type=type;
		this.material=material;
		this.size=size;
		this.color=color;
		this.brand=brand;
		this.price=price;
		this.isWaterproof=isWaterproof;
		this.usage=usage;
		this.origin=origin;
		this.weight=weight;
	}
  void show(){
		System.out.println("Type :"+this.type);
		System.out.println("Material :"+this.material);
		System.out.println("Size :"+this.size);
		System.out.println("Color :"+this.color);
		System.out.println("Brand :"+this.brand);
		System.out.println("Price :"+this.price);
		System.out.println("Waterproof :"+this.isWaterproof);
		System.out.println("Usage :"+this.usage);
		System.out.println("Origin :"+this.origin);
		System.out.println("Weight :"+this.weight);
		System.out.println("============================");
	}
}