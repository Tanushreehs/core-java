class Ring{
	static void details(int size,double weight,double thickness,int price,char material){

		if(size>=5 && size<=15){
			System.out.println("Valid Size");
		}
		else{
			System.out.println("Invalid Size");
		}

		if(weight>=1 && weight<=20){
			System.out.println("Valid Weight");
		}
		else{
			System.out.println("Invalid Weight");
		}

		if(thickness>=1 && thickness<=5){
			System.out.println("Valid Thickness");
		}
		else{
			System.out.println("Invalid Thickness");
		}

		if(price>=100 && price<=50000){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(material=='G' || material=='S'){
			System.out.println("Valid Material");
		}
		else{
			System.out.println("Invalid Material");
		}
	}
}