class TechRunner {

    public static void main(String[] args) {

        TechRoom tr = new TechRoom("Lab1", 20);

        tr.monitor = new Monitor(24, "Hp");
        tr.type = ScreenType.LED;

        tr.details();
    }
}