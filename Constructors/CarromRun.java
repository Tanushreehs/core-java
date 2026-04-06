class CarromRun {

    CarromRun() {
        System.out.println("No-arg constructor");
    }

    void useCarrom(Carrom carrom) {
        if (carrom != null) {
            carrom.display();
        } else {
            System.out.println("Carrom is null");
        }
    }
}