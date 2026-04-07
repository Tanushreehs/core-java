class EnergySystem {

    String location;
    int units;

    SolarPanel solarPanel;
    PowerMode type;

    EnergySystem(String location, int units) {
        this.location = location;
        this.units = units;
    }

    void details() {

        System.out.println("Location: " + this.location);
        System.out.println("Units: " + this.units);
        System.out.println("Mode: " + this.type);

        if(solarPanel != null) {
            solarPanel.show();
        } else {
            System.out.println("SolarPanel is null");
        }
    }
}