class Clothe{
	String brand;
	String type;
	int price;
	public void getInfo(){
		System.out.println("Brand:"+this.brand);
		System.out.println("Type:"+this.type);
		System.out.println("Price:"+this.price);
		
	}
	Clothe(String brand,String type,int price){
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	
}