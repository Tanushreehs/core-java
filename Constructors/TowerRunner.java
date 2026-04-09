class TowerRunner {

    public static void main(String... args) {

        TowerRun towerRun = new TowerRun("Mobile", 100);

        Tower tower = towerRun.info();

        towerRun.show();
        tower.details();
    }
}