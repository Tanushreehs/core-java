class NetRun {

    NetRun() {
        System.out.println("No-arg constructor");
    }

    void useNet(Net net) {
        if (net != null) {
            net.display();
        } else {
            System.out.println("Net is null");
        }
    }
}