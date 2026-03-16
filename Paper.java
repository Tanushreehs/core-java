class Paper{
	static void details(double length,double width,int pages,int price,char type){

		if(length>=20 && length<=40){
			System.out.println("Valid Length");
		}
		else{
			System.out.println("Invalid Length");
		}

		if(width>=15 && width<=30){
			System.out.println("Valid Width");
		}
		else{
			System.out.println("Invalid Width");
		}

		if(pages>=1 && pages<=500){
			System.out.println("Valid Pages");
		}
		else{
			System.out.println("Invalid Pages");
		}

		if(price>=10 && price<=1000){
			System.out.println("Valid Price");
		}
		else{
			System.out.println("Invalid Price");
		}

		if(type=='A' || type=='N'){
			System.out.println("Valid Type");
		}
		else{
			System.out.println("Invalid Type");
		}
	}
}