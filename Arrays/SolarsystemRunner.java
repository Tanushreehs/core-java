class SolarsystemRunner{
	public static void main(String[] args){
		Solarsystem solarSystem=new Solarsystem();
		solarSystem.save("Earth");
		solarSystem.save("Mars");
		solarSystem.save("Jupiter");
		solarSystem.save("Venus");
		solarSystem.save("Mercury");
		solarSystem.search("Pluto");
		solarSystem.search("Earth");
		
	}
	
}