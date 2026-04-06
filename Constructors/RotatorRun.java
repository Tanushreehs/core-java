class RotatorRun {

    RotatorRun() {
        System.out.println("No-arg constructor");
    }

    void useRotator(Rotator rotator) {
        if (rotator != null) {
            rotator.display();
        } else {
            System.out.println("Rotator is null");
        }
    }
}