 class Solarsystem{
	 String[] planets=new String[5];
	 int index=0;
	 void save(String planet){
		 System.out.println("Saving planet names:");
		 if(planet!=null){
			 if(this.index < this.planets.length){
				 this.planets[this.index]=planet;
			     System.out.println("Planet name is: "+planet);
				 System.out.println("Index of the book is: "+this.index);
				 index++;
			 }else{
				  System.out.println("Array index is out of bounds. Cannot store more than: " + this.planets.length);
			 }
			 
		 }else{
			 System.out.println("Cannot save as planet names are null");
		 }
	 }
	 void search(String planet){
		 if(planet!=null){
			 System.out.println("Searching planet name");
			 boolean found=false;
			 for(String temp:this.planets){
				 if(planet==temp){
					 System.out.println("Planet name is found");
					 found=true;
					 break;
				 }
			 }
			 if(!found){
					 System.out.println("Planet name not found");
				 }
			 }
		     else{
			 System.out.println("Planet name is null");
		 }
		 
	 }
 }