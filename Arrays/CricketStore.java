class CricketStore{
	Cricket[] crickets=new Cricket[20];
	int index=0;
    void store(Cricket cricket){
		if(cricket!=null){
			if(index<crickets.length){
				this.crickets[index]=cricket;
				System.out.println("============================");
				System.out.println("Cricket is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null cricket");
		}
	}
   void display(){
		boolean found=false;
		for(Cricket temp:this.crickets){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
   void update(Cricket oldValues, Cricket newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<crickets.length;start++){
				if(oldValues==crickets[start]){
					System.out.println("Old Cricket instance "+start+" with values is:");
					oldValues.show();
                    crickets[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Cricket instance:");
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