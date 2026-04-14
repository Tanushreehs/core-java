class AeroplaneRunner {
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();

        aeroplane.save("Boeing");
        aeroplane.save("Airbus");
        aeroplane.save("Jet");
        aeroplane.save("Cargo");
        aeroplane.save("Helicopter");

        aeroplane.search("Airbus");
    }
}