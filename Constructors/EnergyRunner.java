class EnergyRunner {

    public static void main(String[] args) {

        EnergySystem es = new EnergySystem("Hassan", 50);

        es.solarPanel = new SolarPanel(500, "Adani");
        es.type = PowerMode.DC;

        es.details();
    }
}