class SpaceshipStore{
	Spaceship[] spaceships=new Spaceship[20];
	int index=0;
    void store(Spaceship spaceship){
		if(spaceship!=null){
			if(index<spaceships.length){
				this.spaceships[index]=spaceship;
				System.out.println("============================");
				System.out.println("Spaceship is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null spaceship");
		}
	}
   void display(){
		boolean found=false;
		for(Spaceship temp:this.spaceships){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
    void update(Spaceship oldValues, Spaceship newValues){
		boolean updated=false;

		if(oldValues!=null && newValues!=null){
			for(int start=0;start<spaceships.length;start++){
				if(oldValues==spaceships[start]){
					System.out.println("Old Spaceship instance "+start+" with values is:");
					oldValues.show();
                    spaceships[start]=newValues;
					updated=true;
                   System.out.println("Replaced with new Spaceship instance:");
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