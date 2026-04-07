class FieldRunner {

    public static void main(String[] args) {

        FieldArea fa = new FieldArea("Ravi", 10);

        fa.sugarCane = new SugarCane(12, "High");
        fa.type = CaneCategory.FRESH;

        fa.details();
    }
}