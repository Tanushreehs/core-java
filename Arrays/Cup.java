class Cup{
	String[] utensils=new String[5];
	int index=0;
	void save(String utensil){
		System.out.println("Saving utensils details:");
		if(utensil!=null){
			if(this.index<this.utensils.length){
				this.utensils[this.index]=utensil;
				System.out.println("Utensil name: "+utensil);
				System.out.println("Utensil is stored at index: "+this.index);
				index++;
				
			}else{
		        System.out.println("Array index out of bounds,cannot store at "+this.utensils.length);
			}
			
			
		}else{
			System.out.println("Cannot save because of null name");
		}
	}
	void search(String utensil){
		if(utensil!=null){
			boolean found=false;
			for(String temp:this.utensils){
				if(temp==utensil){
					System.out.println("Utensil if found");
					found=true;
					break;
				}
			}if(!found){
				System.out.println("Utensil not found");
			}
			
		}
		else{
			System.out.println("Cannot search as the name is null");
		}
	}
}