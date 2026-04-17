class Equipment{
	 
	Equipment(){
		System.out.println("Running no-arg constructor in Equipment");
		
	}
}
class Device extends Equipment{
      Device(){
		 System.out.println("Running no-arg constructor in Device");
	  }
}
class Instrument extends Device{
	Instrument(){
		System.out.println("Running no-arg constructor in Instrument");
	}
}
class MusicalInstrument extends Instrument{
	MusicalInstrument(){
	System.out.println("Running no-arg constructor in MusicalInstrument");
}
}
class Guitar extends MusicalInstrument{
	Guitar(){
	System.out.println("Running no-arg constructor in Guitar");
}
}	  	  
