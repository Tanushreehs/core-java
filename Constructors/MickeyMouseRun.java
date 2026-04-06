class MickeyMouseRun {

    MickeyMouseRun() {
        System.out.println("No-arg constructor");
    }

    void useMickeyMouse(MickeyMouse mickey) {
        if (mickey != null) {
            mickey.display();
        } else {
            System.out.println("MickeyMouse is null");
        }
    }
}