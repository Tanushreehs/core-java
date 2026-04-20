class TouchPadRunner {
    public static void main(String[] args) {
        LaptopTouchPad touchPad1 = new LaptopTouchPad("Dell", 15);
        LaptopTouchPad touchPad2 = new LaptopTouchPad("HP", 14);
        System.out.println("TouchPad 1: Brand=" + touchPad1.brand + ", Size=" + touchPad1.size);
        System.out.println("TouchPad 2: Brand=" + touchPad2.brand + ", Size=" + touchPad2.size);
    }
}