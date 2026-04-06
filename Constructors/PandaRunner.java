public class PandaRunner {
    public static void main(String[] args) {

        Panda panda1 = new Panda();
        PandaRun pandarun = new PandaRun();
        pandarun.usePanda(panda1);

        Panda panda2 = null;
        pandarun.usePanda(panda2);
    }
}