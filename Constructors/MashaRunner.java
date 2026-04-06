public class MashaRunner {
    public static void main(String[] args) {

        Masha masha1 = new Masha();
        MashaRun masharun = new MashaRun();
        masharun.useMasha(masha1);

        Masha masha2 = null;
        masharun.useMasha(masha2);
    }
}