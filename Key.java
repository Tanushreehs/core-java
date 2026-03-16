class Key{
	static void details(double length,double weight,int price,double thickness,char type){

		if(length>=3 && length<=10){
			System.out.println("Valid Length");
		}
		else{
			System.out.println("Invalid Length");
		}

		if(weight>=5 && weight<=50){
			System.out.println("Valid Weight");
		}
		else{
			System.out.println("Invalid Weight");
		}

		if(price>=10 && price<=500){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(thickness>=1 && thickness<=5){
			System.out.println("Valid Thickness");
		}
		else{
			System.out.println("Invalid Thickness");
		}

		if(type=='D' || type=='L'){
			System.out.println("Valid Type");
		}
		else{
			System.out.println("Invalid Type");
		}
	}
}