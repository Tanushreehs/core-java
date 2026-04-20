class ThreadRunner {
    public static void main(String[] args) {
        SewingThread thread1 = new SewingThread("Red", 5);
        SewingThread thread2 = new SewingThread("Blue", 6);
        System.out.println("Thread 1: Color=" + thread1.color + ", Size=" + thread1.size);
        System.out.println("Thread 2: Color=" + thread2.color + ", Size=" + thread2.size);
    }
}