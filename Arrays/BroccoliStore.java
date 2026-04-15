class BroccoliStore{
	Broccoli[] broccolis=new Broccoli[20];
	int index=0;
    void store(Broccoli broccoli){
		if(broccoli!=null){
			if(index<broccolis.length){
				this.broccolis[index]=broccoli;
				System.out.println("============================");
				System.out.println("Broccoli is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null broccoli");
		}
	}
   void display(){
		boolean found=false;
		for(Broccoli temp:this.broccolis){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
    void update(Broccoli oldValues, Broccoli newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<broccolis.length;start++){
				if(oldValues==broccolis[start]){
					System.out.println("Old Broccoli instance "+start+" with values is:");
					oldValues.show();
                    broccolis[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Broccoli instance:");
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