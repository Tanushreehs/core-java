public class CoinRunner {
    public static void main(String[] args) {

        Coin coin1 = new Coin();
        CoinRun coinrun = new CoinRun();
        coinrun.useCoin(coin1);

     
        Coin coin2 = null;
        coinrun.useCoin(coin2);
    }
}