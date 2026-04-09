class LockRun {

    String type;
    int price;

    LockRun(String type, int price) {
        this.type = type;
        this.price = price;
    }

    Lock info() {
        Lock lock = new Lock("Silver", this.type, this.price);
        return lock;
    }

    void show() {
        System.out.println("LockRun type : " + this.type);
        System.out.println("LockRun price : " + this.price);
    }
}