class RodRunner {
    public static void main(String[] args) {

        Rod.metalType();
        System.out.println("\nUpdated values:\n");
        String type = "Steel";
        double wt = 54.0;
        double ht = 25.0;
        double dia = 1.2;

        Rod.metalType(type, wt, ht, dia);
    }
}