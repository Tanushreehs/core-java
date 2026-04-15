class Laser{
	String type;
	double wavelength;
	double power;
	String color;
	String application;
	boolean isPortable;
	String material;
	double price;
	String brand;
	String origin;
	Laser(String type,double wavelength,double power,String color,String application,boolean isPortable,String material,double price,String brand,String origin){
		this.type=type;
		this.wavelength=wavelength;
		this.power=power;
		this.color=color;
		this.application=application;
		this.isPortable=isPortable;
		this.material=material;
		this.price=price;
		this.brand=brand;
		this.origin=origin;
	}
	void show(){
		System.out.println("Type :"+this.type);
		System.out.println("Wavelength :"+this.wavelength);
		System.out.println("Power :"+this.power);
		System.out.println("Color :"+this.color);
		System.out.println("Application :"+this.application);
		System.out.println("Portable :"+this.isPortable);
		System.out.println("Material :"+this.material);
		System.out.println("Price :"+this.price);
		System.out.println("Brand :"+this.brand);
		System.out.println("Origin :"+this.origin);
		System.out.println("============================");
	}
}