class Ice{
	static void details(double temp,double weight,int price,double size,char shape){

		if(temp<=0){
			System.out.println("Valid Temperature");
		}
		else{
			System.out.println("Invalid Temperature");
		}

		if(weight>=50 && weight<=1000){
			System.out.println("Valid Weight");
		}
		else{
			System.out.println("Invalid Weight");
		}

		if(price>=5 && price<=200){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(size>=1 && size<=10){
			System.out.println("Valid Size");
		}
		else{
			System.out.println("Invalid Size");
		}

		if(shape=='C' || shape=='S'){
			System.out.println("Valid Shape");
		}
		else{
			System.out.println("Invalid Shape");
		}
	}
}