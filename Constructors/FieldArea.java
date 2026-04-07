class FieldArea {

    String ownerName;
    int acres;

    SugarCane sugarCane;
    CaneCategory type;

    FieldArea(String ownerName, int acres) {
        this.ownerName = ownerName;
        this.acres = acres;
    }

    void details() {

        System.out.println("Owner: " + this.ownerName);
        System.out.println("Acres: " + this.acres);
        System.out.println("Type: " + this.type);

        if(sugarCane != null) {
            sugarCane.show();
        } else {
            System.out.println("SugarCane is null");
        }
    }
}