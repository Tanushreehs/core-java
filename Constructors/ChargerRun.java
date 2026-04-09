class ChargerRun {

    String type;
    int power;

    ChargerRun(String type, int power) {
        this.type = type;
        this.power = power;
    }

    Charger info() {
        Charger charger = new Charger("Black", this.type, this.power);
        return charger;
    }

    void show() {
        System.out.println("ChargerRun type: " + this.type);
        System.out.println("ChargerRun power: " + this.power);
    }
}