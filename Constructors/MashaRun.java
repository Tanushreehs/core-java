class MashaRun {

    MashaRun() {
        System.out.println("No-arg constructor");
    }

    void useMasha(Masha masha) {
        if (masha != null) {
            masha.display();
        } else {
            System.out.println("Masha is null");
        }
    }
}