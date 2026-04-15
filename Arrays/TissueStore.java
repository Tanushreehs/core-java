class TissueStore{
	Tissue[] tissues=new Tissue[20];
	int index=0;

	void store(Tissue tissue){
		if(tissue!=null){
			if(index<tissues.length){
				this.tissues[index]=tissue;
				System.out.println("============================");
				System.out.println("Tissue is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null tissue");
		}
	}
   void display(){
		boolean found=false;
		for(Tissue temp:this.tissues){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
     void update(Tissue oldValues, Tissue newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<tissues.length;start++){
				if(oldValues==tissues[start]){
					System.out.println("Old Tissue instance "+start+" with values is:");
					oldValues.show();
                    tissues[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Tissue instance: ");
					newValues.show();
				}
			}
            if(!updated){
				System.out.println("Old object not found");
			}

		}else{
			System.out.println("Old or new object cannot be null");
		}
	}
}