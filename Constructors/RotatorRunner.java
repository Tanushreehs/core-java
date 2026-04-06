public class RotatorRunner {
    public static void main(String[] args) {

        Rotator rotator1 = new Rotator();
        RotatorRun rotatorrun = new RotatorRun();
        rotatorrun.useRotator(rotator1);

        Rotator rotator2 = null;
        rotatorrun.useRotator(rotator2);
    }
}