class SwordRunner {

    public static void main(String... args) {

        SwordRun swordRun = new SwordRun("War", 120);

        Sword sword = swordRun.info();

        swordRun.show();
        sword.details();
    }
}