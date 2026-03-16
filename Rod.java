class Rod{
	static void metalType(){
		String type="Iron";
		double weight=50.0;
		double height=20.0;
		String brand="TMT";
		String SurfaceFinish="Smooth";
		double diameter=1.1;
		boolean isElastic=true;
		double volume=1.0;
		System.out.println("Type:"+type);
		System.out.println("Weight:"+weight);
	    System.out.println("Height:"+height);
		System.out.println("Brand:"+brand);
	    System.out.println("Surface finish:"+SurfaceFinish);
	    System.out.println("Diameter:"+diameter);
		System.out.println("is it Elastic:"+isElastic);
		System.out.println("Volume:"+volume);
			
	}
    
     static void metalType(String type,double weight,double height,double diameter){
	   	System.out.println("Type:"+type);
		System.out.println("Weight:"+weight);
	    System.out.println("Height:"+height);
	    System.out.println("Diameter:"+diameter);
		
		 
	 }

}