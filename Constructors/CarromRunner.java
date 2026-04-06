public class CarromRunner {
    public static void main(String[] args) {

        Carrom carrom1 = new Carrom();
        CarromRun carromrun = new CarromRun();
        carromrun.useCarrom(carrom1);

        Carrom carrom2 = null;
        carromrun.useCarrom(carrom2);
    }
}