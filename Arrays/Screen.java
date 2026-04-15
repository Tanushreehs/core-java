class Screen{
	String brand;
	double size;
	String resolution;
	String panelType;
	int refreshRate;
	double price;
	String color;
	String connectivity;
	boolean isSmart;
	String warranty;
	Screen(String brand,double size,String resolution,String panelType,int refreshRate,double price,String color,String connectivity,boolean isSmart,String warranty){
		this.brand=brand;
		this.size=size;
		this.resolution=resolution;
		this.panelType=panelType;
		this.refreshRate=refreshRate;
		this.price=price;
		this.color=color;
		this.connectivity=connectivity;
		this.isSmart=isSmart;
		this.warranty=warranty;
	}
	void show(){
		System.out.println("Brand :"+this.brand);
		System.out.println("Size :"+this.size);
		System.out.println("Resolution :"+this.resolution);
		System.out.println("Panel Type :"+this.panelType);
		System.out.println("Refresh Rate :"+this.refreshRate);
		System.out.println("Price :"+this.price);
		System.out.println("Color :"+this.color);
		System.out.println("Connectivity :"+this.connectivity);
		System.out.println("Is Smart :"+this.isSmart);
		System.out.println("Warranty :"+this.warranty);
		System.out.println("============================");
	}
}