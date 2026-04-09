class DiamondRunner {

    public static void main(String... args) {

        DiamondRun diamondRun = new DiamondRun("Gem", 10000);

        Diamond diamond = diamondRun.info();

        diamondRun.show();
        diamond.details();
    }
}