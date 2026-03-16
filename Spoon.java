class Spoon{
	static void details(int length,double weight,double thickness,int price,char type){

		if(length>=10 && length<=25){
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

		if(thickness>=1 && thickness<=5){
			System.out.println("Valid Thickness");
		}
		else{
			System.out.println("Invalid Thickness");
		}

		if(price>=10 && price<=250){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(type=='S' || type=='P'){
			System.out.println("Valid Type");
		}
		else{
			System.out.println("Invalid Type");
		}
	}
}