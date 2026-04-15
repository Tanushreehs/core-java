class ScreenStore{
	Screen[] screens=new Screen[20];
	int index=0;
    void store(Screen screen){
		if(screen!=null){
			if(index<screens.length){
				this.screens[index]=screen;
				System.out.println("============================");
				System.out.println("Screen is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null screen");
		}
	}
    void display(){
		boolean found=false;
		for(Screen temp:this.screens){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
   void update(Screen oldValues, Screen newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<screens.length;start++){
				if(oldValues==screens[start]){
					System.out.println("Old Screen instance "+start+" with values is:");
					oldValues.show();
					updated=true;
                    System.out.println("Replaced with screen instance values:");
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