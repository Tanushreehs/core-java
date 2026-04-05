class Rocket {
    String name;
    String country;
    String type;
    String fuelType;
    String manufacturer;
    String missionType;
    String launchSite;
    String status;
    int stages;
    double weight;
    Rocket(String name, String country, String type, String fuelType,
           String manufacturer, String missionType, String launchSite,
           String status, int stages, double weight) {

        this.name = name;
        this.country = country;
        this.type = type;
        this.fuelType = fuelType;
        this.manufacturer = manufacturer;
        this.missionType = missionType;
        this.launchSite = launchSite;
        this.status = status;
        this.stages = stages;
        this.weight = weight;
    }
    void display() {
        System.out.println(name + "," + country + "," + type + "," + fuelType + "," +
                manufacturer + "," + missionType + "," + launchSite + "," +
                status + "," + stages + "," + weight);
    }
}