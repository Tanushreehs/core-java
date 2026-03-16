class ProcessRunner{
	public static void main(String[] args){
		System.out.println("\nImplicit declaration:\n");
		Processor.details(64,7,5.1,32,128);
		System.out.println("\nExplicit declaration:\n");
		int storage=128;
		int gen=8;
		double speed=7.6; 
		int cores=64;
		int thrds=32;
		Processor.details(storage,gen,speed,cores,thrds);
	}
}