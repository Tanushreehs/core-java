class Movie{
	String name;
	String language;
	String genre;
	double duration;
	String director;
	String hero;
	String heroine;
	double rating;
	String releaseYear;
	double budget;
    Movie(String name,String language,String genre,double duration,String director,String hero,String heroine,double rating,String releaseYear,double budget){
		this.name=name;
		this.language=language;
		this.genre=genre;
		this.duration=duration;
		this.director=director;
		this.hero=hero;
		this.heroine=heroine;
		this.rating=rating;
		this.releaseYear=releaseYear;
		this.budget=budget;
	}
   void show(){
		System.out.println("Name :"+this.name);
		System.out.println("Language :"+this.language);
		System.out.println("Genre :"+this.genre);
		System.out.println("Duration :"+this.duration);
		System.out.println("Director :"+this.director);
		System.out.println("Hero :"+this.hero);
		System.out.println("Heroine :"+this.heroine);
		System.out.println("Rating :"+this.rating);
		System.out.println("Release Year :"+this.releaseYear);
		System.out.println("Budget :"+this.budget);
		System.out.println("============================");
	}
}