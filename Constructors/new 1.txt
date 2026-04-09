class DayRun {

    String type;
    int hours;

    DayRun(String type, int hours) {
        this.type = type;
        this.hours = hours;
    }

    Day info() {
        Day day = new Day("Monday", this.type, this.hours);
        return day;
    }

    void show() {
        System.out.println("DayRun type : " + this.type);
        System.out.println("DayRun hours : " + this.hours);
    }
}