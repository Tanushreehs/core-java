class LockRunner {

    public static void main(String... args) {

        LockRun lockRun = new LockRun("Door", 500);

        Lock lock = lockRun.info();

        lockRun.show();
        lock.details();
    }
}