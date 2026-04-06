class CoinRun {
     CoinRun(){
	     System.out.println("No-arg constructor");
	 }

    void useCoin(Coin coin) {
        if (coin != null) {
            coin.display();
        } else {
            System.out.println("Coin is null");
        }
    }
}