class WaterRun {

    WaterRun() {
        System.out.println("No-arg constructor");
    }

    void useWater(Water water) {
        if (water != null) {
            water.display();
        } else {
            System.out.println("Water is null");
        }
    }
}