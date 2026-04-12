class Runner{
	public static void main(String... values){
		System.out.println("Printing values: "+values);
		if(values.length==2){
			System.out.println("Length is valid");
			String name=values[0];
			String age=values[1];
			int convertedAge=Integer.valueOf(age);
			if (convertedAge>=18){
				System.out.println(name + " is eligible to vote");
			}
			else{
				System.out.println("Not eligible to vote");
			}
		}
		else{
			System.out.println("Length is insufficient");
	}
	
}
}