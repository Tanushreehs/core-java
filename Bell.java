class Bell{
	static void details(double weight,double height,int price,double radius,char material){

		if(weight>=100 && weight<=5000){
			System.out.println("Valid Weight");
		}
		else{
			System.out.println("Invalid Weight");
		}

		if(height>=5 && height<=50){
			System.out.println("Valid Height");
		}
		else{
			System.out.println("Invalid Height");
		}

		if(price>=100 && price<=5000){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(radius>=2 && radius<=20){
			System.out.println("Valid Radius");
		}
		else{
			System.out.println("Invalid Radius");
		}

		if(material=='B' || material=='I'){
			System.out.println("Valid Material");
		}
		else{
			System.out.println("Invalid Material");
		}
	}
}