class SandRunner {

    public static void main(String... args) {

        SandRun sandRun = new SandRun("River", 50);

        Sand sand = sandRun.info();

        sandRun.show();
        sand.details();
    }
}