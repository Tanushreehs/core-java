class Armstrong{
	static void isArmstrong(int number){
		int original=number;
		int sum=0;
		while(number>0){
			int digit = number % 10;
			sum = sum+digit*digit*digit;
			number = number/10;
		}
		if(sum == original){
				System.out.println(original + " is Armstrong");
			}
		else{
				System.out.println(original + " is not armstrong");
			}
		}
	}
