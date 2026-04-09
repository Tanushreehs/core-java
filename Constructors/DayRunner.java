class DayRunner {

    public static void main(String... args) {

        DayRun dayRun = new DayRun("Working", 24);

        Day day = dayRun.info();

        dayRun.show();
        day.details();
    }
}