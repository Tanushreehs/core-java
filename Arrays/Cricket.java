class Cricket{
	String teamName;
	String captain;
	int playersCount;
	String format;
	String homeGround;
	int matchesPlayed;
	int matchesWon;
	int matchesLost;
	double runRate;
	String country;
	Cricket(String teamName,String captain,int playersCount,String format,String homeGround,int matchesPlayed,int matchesWon,int matchesLost,double runRate,String country){
		this.teamName=teamName;
		this.captain=captain;
		this.playersCount=playersCount;
		this.format=format;
		this.homeGround=homeGround;
		this.matchesPlayed=matchesPlayed;
		this.matchesWon=matchesWon;
		this.matchesLost=matchesLost;
		this.runRate=runRate;
		this.country=country;
	}
	void show(){
		System.out.println("Team Name :"+this.teamName);
		System.out.println("Captain :"+this.captain);
		System.out.println("Players Count :"+this.playersCount);
		System.out.println("Format :"+this.format);
		System.out.println("Home Ground :"+this.homeGround);
		System.out.println("Matches Played :"+this.matchesPlayed);
		System.out.println("Matches Won :"+this.matchesWon);
		System.out.println("Matches Lost :"+this.matchesLost);
		System.out.println("Run Rate :"+this.runRate);
		System.out.println("Country :"+this.country);
		System.out.println("============================");
	}
}