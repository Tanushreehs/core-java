class LiftRunner {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.save("Passenger");
        lift.save("Goods");
        lift.save("Hospital");
        lift.save("Service");
        lift.save("Capsule");

        lift.search("Hospital");
    }
}