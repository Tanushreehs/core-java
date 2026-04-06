public class WaterRunner {
    public static void main(String[] args) {

        Water water1 = new Water();
        WaterRun waterrun = new WaterRun();
        waterrun.useWater(water1);

        Water water2 = null;
        waterrun.useWater(water2);
    }
}