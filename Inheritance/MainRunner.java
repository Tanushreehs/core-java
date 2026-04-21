class MainRunner {
    public static void main(String[] args) {
        Store storeDetails = new Store();
        Coin coinDetails = new Coin();
        Stock stockDetails = new Stock();
        Hospital hospitalDetails = new Hospital();
        Temple templeDetails = new Temple();
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant("Empire", "Hassan");
        Candle candle1 = new Candle();
        Candle candle2 = new Candle("Blue", 80);
        PrivateFarmHouse farmHouse1 = new PrivateFarmHouse("Ramesh", 15, "Yes");
        PrivateFarmHouse farmHouse2 = new PrivateFarmHouse("Suresh", 25, "No");
        Sock sock1 = new Sock();
        sock1.sockBrand = "Nike";
        System.out.println("Sock Brand: " + sock1.sockBrand);
        Tape tape1 = new Tape(75);
        System.out.println("Tape Length: " + tape1.tapeLength);
        PodiumChild podium1 = new PodiumChild();
        PodiumChild podium2 = new PodiumChild();
        podium1.showWinner();
        podium1.playSong();
        podium1.displayRanks();
        podium1.declareResult();
        podium1.finishEvent();
        podium2.showWinner();
        podium2.playSong();
        podium2.displayRanks();
        podium2.declareResult();
        podium2.finishEvent();
    }
}