public class PowderRunner {
    public static void main(String[] args) {

        Powder powder1 = new Powder();
        PowderRun powderrun = new PowderRun();
        powderrun.usePowder(powder1);

        Powder powder2 = null;
        powderrun.usePowder(powder2);
    }
}