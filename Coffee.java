class Coffee{
	static void details(double temp,double quantity,int sugar,int price,char type){

		if(temp>=30 && temp<=100){
			System.out.println("Valid Temperature");
		}
		else{
			System.out.println("Invalid Temperature");
		}

		if(quantity>=50 && quantity<=500){
			System.out.println("Valid Quantity");
		}
		else{
			System.out.println("Invalid Quantity");
		}

		if(sugar>=0 && sugar<=10){
			System.out.println("Valid Sugar");
		}
		else{
			System.out.println("Invalid Sugar");
		}

		if(price>=20 && price<=500){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(type=='E' || type=='C'){
			System.out.println("Valid Type");
		}
		else{
			System.out.println("Invalid Type");
		}
	}
}