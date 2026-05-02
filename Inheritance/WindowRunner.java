class Window {
    String material;
    int size;

    void open() {
        System.out.println("Window is opening");
    }

    void close() {
        System.out.println("Window is closing");
    }
}

class SlidingWindow extends Window {
    String direction;

    @Override
    void open() {
        System.out.println("Sliding window is opening sideways");
    }

    @Override
    void close() {
        System.out.println("Sliding window is closing sideways");
    }
}

class WindowRunner {
    public static void main(String[] args) {
        SlidingWindow obj = new SlidingWindow();

        obj.material = "Glass";
        obj.size = 5;
        obj.direction = "Horizontal";

        obj.open();
        obj.close();
    }
}