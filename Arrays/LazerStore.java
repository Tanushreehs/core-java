class LaserStore{
	Laser[] lasers=new Laser[20];
	int index=0;
    void store(Laser laser){
		if(laser!=null){
			if(index<lasers.length){
				this.lasers[index]=laser;
				System.out.println("============================");
				System.out.println("Laser is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null laser");
		}
	}
   void display(){
		boolean found=false;
		for(Laser temp:this.lasers){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
   void update(Laser oldValues, Laser newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<lasers.length;start++){
				if(oldValues==lasers[start]){
					System.out.println("Old Laser instance "+start+" with values is:");
					oldValues.show();
                    lasers[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Laser instance:");
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