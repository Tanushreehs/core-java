class WatermelonStore{
		Watermelon[] watermelons=new Watermelon[20];
		int index=0;
		void store(Watermelon watermelon){
			if(watermelon!=null){
				if(index<watermelons.length){
					this.watermelons[index]=watermelon;
					System.out.println("============================");
					System.out.println("Watermelon is stored at index :"+index);
					index++;
				}else{
					System.out.println("Array index out of bounds");
			}
			}
		    else{
				System.out.println("cannot save null watermelon");
			}
		}
		void display(){
			boolean found=false;
			for(Watermelon temp:this.watermelons){
				if(temp!=null){
					temp.show();
					found=true;
					
				}
			}
			if(!found){
				System.out.println("Cannot display null values");
			}
		}
		void update(Watermelon oldName, Watermelon newName) {
        boolean updated = false;
         if (oldName != null && newName != null) {
          for (int start = 0; start < watermelons.length; start++) {
             if (oldName == watermelons[start]) {
                System.out.println("Old Watermelon instance " + start + " is:");
                oldName.show();
                watermelons[start] = newName;
                updated = true;
                System.out.println("Replaced with new Watermelon instance :");
                newName.show();
            }
        }

        if (!updated) {
            System.out.println("Old object not found");
        }

    } else {
        System.out.println("Old or new object cannot be null");
    }
}
}