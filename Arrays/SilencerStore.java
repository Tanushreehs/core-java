class SilencerStore{
	Silencer[] silencers=new Silencer[20];
	int index=0;
    void store(Silencer silencer){
		if(silencer!=null){
			if(index<silencers.length){
				this.silencers[index]=silencer;
				System.out.println("============================");
				System.out.println("Silencer is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null silencer");
		}
	}
    void display(){
		boolean found=false;
		for(Silencer temp:this.silencers){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
    void update(Silencer oldValues, Silencer newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<silencers.length;start++){
				if(oldValues==silencers[start]){
					System.out.println("Old Silencer instance "+start+" with values is:");
					oldValues.show();
                    silencers[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Silencer instance values:");
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