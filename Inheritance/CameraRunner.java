class CameraRunner {
    public static void main(String[] args) {
        DSLR camera1 = new DSLR("Canon", 24);
        DSLR camera2 = new DSLR("Nikon", 20);
		System.out.println("Camera 1: Brand=" + camera1.brand + ", MP=" + camera1.megapixel);
        System.out.println("Camera 2: Brand=" + camera2.brand + ", MP=" + camera2.megapixel);
    }
}