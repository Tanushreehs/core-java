class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlug sparkPlug = new SparkPlug();

        sparkPlug.save("NGK");
        sparkPlug.save("Bosch");
        sparkPlug.save("Denso");
        sparkPlug.save("Champion");
        sparkPlug.save("Autolite");

        sparkPlug.search("Bosch");
    }
}