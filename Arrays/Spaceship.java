class Spaceship{
	String name;
	String type;
	int crewCapacity;
	double speed;
	String fuelType;
	String mission;
	String manufacturer;
	double weight;
	boolean isReusable;
	String origin;
    Spaceship(String name,String type,int crewCapacity,double speed,String fuelType,String mission,String manufacturer,double weight,boolean isReusable,String origin){
		this.name=name;
		this.type=type;
		this.crewCapacity=crewCapacity;
		this.speed=speed;
		this.fuelType=fuelType;
		this.mission=mission;
		this.manufacturer=manufacturer;
		this.weight=weight;
		this.isReusable=isReusable;
		this.origin=origin;
	}
   void show(){
		System.out.println("Name :"+this.name);
		System.out.println("Type :"+this.type);
		System.out.println("Crew Capacity :"+this.crewCapacity);
		System.out.println("Speed :"+this.speed);
		System.out.println("Fuel Type :"+this.fuelType);
		System.out.println("Mission :"+this.mission);
		System.out.println("Manufacturer :"+this.manufacturer);
		System.out.println("Weight :"+this.weight);
		System.out.println("Reusable :"+this.isReusable);
		System.out.println("Origin :"+this.origin);
		System.out.println("============================");
	}
}