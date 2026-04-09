class SwordRun {

    String type;
    int length;

    SwordRun(String type, int length) {
        this.type = type;
        this.length = length;
    }

    Sword info() {
        Sword sword = new Sword("Silver", this.type, this.length);
        return sword;
    }

    void show() {
        System.out.println("SwordRun type : " + this.type);
        System.out.println("SwordRun length : " + this.length);
    }
}