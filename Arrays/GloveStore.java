class GloveStore{
	Glove[] gloves=new Glove[20];
	int index=0;
    void store(Glove glove){
		if(glove!=null){
			if(index<gloves.length){
				this.gloves[index]=glove;
				System.out.println("============================");
				System.out.println("Glove is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null glove");
		}
	}
    void display(){
		boolean found=false;
		for(Glove temp:this.gloves){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
    void update(Glove oldValues, Glove newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<gloves.length;start++){
				if(oldValues==gloves[start]){
					System.out.println("Old Glove instance "+start+" with values is:");
					oldValues.show();
                    gloves[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Glove instance:");
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