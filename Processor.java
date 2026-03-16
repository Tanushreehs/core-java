class Processor{
	static void details(int storage,int generation,double speed,int cores,int threads){
		System.out.println("Storage:"+storage);
		System.out.println("Generation:"+generation);
		System.out.println("Speed:"+speed);
		System.out.println("Cores:"+cores);
		System.out.println("Threads:"+threads);
		if(storage>=32 && storage<=512){
			System.out.println("Valid Storage");
		}
		else{
			System.out.println("Invalid storage");
		}
		if(generation>=1 && generation<=15){
			System.out.println("Valid Genaration");
		}
		else{
			System.out.println("Invalid Generation");
		}
		if(speed>=1.5 && speed<=5.5){
			System.out.println("Speed is valid");
		}
		else{
			System.out.println("Speed is invalid");
		}
		if(cores>=1 && cores<=128){
			System.out.println("Cores valid");
		}
		else{
			System.out.println("Cores invalid");
		}
		if(threads>=1 && threads<=256){
			System.out.println("Threads are valid");
		}
		else{
			System.out.println("Threads are invalid");
		}
		
	}

}