class AcidRun {

    String type;
    int level;

    AcidRun(String type, int level) {
        this.type = type;
        this.level = level;
    }

    Acid info() {
        Acid acid = new Acid("Clear", this.type, this.level);
        return acid;
    }

    void show() {
        System.out.println("AcidRun type : " + this.type);
        System.out.println("AcidRun level : " + this.level);
    }
}