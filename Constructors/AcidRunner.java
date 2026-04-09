class AcidRunner {

    public static void main(String... args) {

        AcidRun acidRun = new AcidRun("Chemical", 5);

        Acid acid = acidRun.info();

        acidRun.show();
        acid.details();
    }
}