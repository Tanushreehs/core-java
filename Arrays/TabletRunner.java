class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();

        tablet.save("Tablet");
        tablet.save("iPad");
        tablet.save("SamsungTab");
        tablet.save("LenovoTab");
        tablet.save("MiPad");

        tablet.search("iPad");
    }
}