class Prime{
	static void checkPrime(int number){
		int count=0;
		for(int i=1;i<=number;i++){
			count++;
		}
		if(count==2){
			System.out.println(number + "is prime");
		}
		else{
			System.out.println(number + "is not prime");
		}
	}
}