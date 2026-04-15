class MovieStore{
	Movie[] movies=new Movie[20];
	int index=0;
    void store(Movie movie){
		if(movie!=null){
			if(index<movies.length){
				this.movies[index]=movie;
				System.out.println("============================");
				System.out.println("Movie is stored at index :"+index);
				index++;
			}else{
				System.out.println("Array index out of bounds");
			}
		}else{
			System.out.println("cannot save null movie");
		}
	}
   void display(){
		boolean found=false;
		for(Movie temp:this.movies){
			if(temp!=null){
				temp.show();
				found=true;
			}
		}
		if(!found){
			System.out.println("Cannot display null values");
		}
	}
   void update(Movie oldValues, Movie newValues){
		boolean updated=false;
        if(oldValues!=null && newValues!=null){
			for(int start=0;start<movies.length;start++){
				if(oldValues==movies[start]){
					System.out.println("Old Movie instance "+start+" with values is:");
					oldValues.show();
                    movies[start]=newValues;
					updated=true;
                    System.out.println("Replaced with new Movie instance:");
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