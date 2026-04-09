class Day {

    String name;
    String type;
    int hours;

    Day(String name, String type, int hours) {
        this.name = name;
        this.type = type;
        this.hours = hours;
    }

    void details() {
        System.out.println("Day name : " + this.name);
        System.out.println("Day type : " + this.type);
        System.out.println("Day hours : " + this.hours);
    }
}