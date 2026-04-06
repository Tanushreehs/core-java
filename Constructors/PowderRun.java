class PowderRun {

    PowderRun() {
        System.out.println("No-arg constructor");
    }

    void usePowder(Powder powder) {
        if (powder != null) {
            powder.display();
        } else {
            System.out.println("Powder is null");
        }
    }
}