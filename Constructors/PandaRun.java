class PandaRun {

    PandaRun() {
        System.out.println("No-arg constructor");
    }

    void usePanda(Panda panda) {
        if (panda != null) {
            panda.display();
        } else {
            System.out.println("Panda is null");
        }
    }
}