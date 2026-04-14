class AlloyRunner {
    public static void main(String[] args) {
        Alloy alloy= new Alloy();

        alloy.save("Steel");
        alloy.save("Bronze");
        alloy.save("Brass");
        alloy.save("Aluminum");
        alloy.save("Titanium");

        alloy.search("Steel");
    }
}