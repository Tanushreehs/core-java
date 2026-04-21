class Candle {
    String candleColor;
    int candleCost;
    Candle() {
        this("White", 40);
        System.out.println("Default Candle");
    }
    Candle(String candleColor, int candleCost) {
        this.candleColor = candleColor;
        this.candleCost = candleCost;
        System.out.println("Parameterized Candle");
    }
}