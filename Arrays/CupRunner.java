class CupRunner{
	public static void main(String[] args){
		Cup cup = new Cup();
		cup.save("mug");
		cup.save("tub");
		cup.save("spoon");
		cup.save("bottle");
		cup.save("jar");
		cup.save("container");
		cup.search("container");
		
	}
}