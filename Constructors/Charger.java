class Charger {

    String color;
    String type;
    int power;

    Charger(String color, String type, int power) {
        this.color = color;
        this.type = type;
        this.power = power;
    }

    void details() {
        System.out.println("Charger color : " + this.color);
        System.out.println("Charger type : " + this.type);
        System.out.println("Charger power : " + this.power);
    }
}