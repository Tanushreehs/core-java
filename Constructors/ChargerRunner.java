class ChargerRunner {

    public static void main(String... args) {

        ChargerRun run = new ChargerRun("Fast", 65);

        Charger charger = run.info();

        run.show();
        charger.details();
    }
}