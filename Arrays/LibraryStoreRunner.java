class LibraryStoreRunner{
	public static void main(String [] args){
		LibraryStore libraryStore=new LibraryStore();
		libraryStore.saveBookName("Can we be Strangers again");
		libraryStore.saveBookName("Girl in a room 105");
		libraryStore.saveBookName("Naadaleele");
		libraryStore.saveBookName("gari");
		libraryStore.saveBookName("Sakhi");
		libraryStore.saveBookName("Ramayana");
		libraryStore.search("gari");
		libraryStore.search("Ninaada");
		

		
		
		
	}
}