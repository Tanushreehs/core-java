class Chicken{
	static void details(double weight,int price,int pieces,double size,char type){

		if(weight>=0.5 && weight<=5){
			System.out.println("Valid Weight");
		}
		else{
			System.out.println("Invalid Weight");
		}

		if(price>=200 && price<=1000){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(pieces>=1 && pieces<=20){
			System.out.println("Valid Pieces");
		}
		else{
			System.out.println("Invalid Pieces");
		}

		if(size>=1 && size<=10){
			System.out.println("Valid Size");
		}
		else{
			System.out.println("Invalid Size");
		}

		if(type=='B' || type=='C'){
			System.out.println("Valid Type");
		}
		else{
			System.out.println("Invalid Type");
		}
	}
}