class LibraryStore {
    String[] names = new String[5];
    int index;

    void saveBookName(String name) {
		System.out.println("Saving book details: " );

        if (name != null) {
            

            if (this.index < this.names.length) {
                this.names[this.index] = name;
				System.out.println("Book name is: "+name);
				System.out.println("Index of the book is: "+this.index);
                index++;
            } else {
                System.out.println("Array index is out of bounds. Cannot store more than: " + this.names.length);
            }

        } else {
            System.out.println("Saving cannot be done as the name is null");
        }
    }
	void search(String name){
		if(name!=null){
			System.out.println("Name is being searched:");
			boolean found=false;
			for (String temp:this.names){
				if(name==temp){
				System.out.println("book is found");
				found=true;
				break;
			}
		   }
			if(!found){
				System.out.println("Book is not found");
			}
		}
		else{
			System.out.println("Name is null");
		}
		
	}
}