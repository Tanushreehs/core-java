class FaceWash {
    void use() {
        System.out.println("Using regular face wash");
    }
}

class NeemFaceWash extends FaceWash {
    void use() {
        System.out.println("Using neem face wash for acne control");
    }
}

class FaceWashRunner {
    public static void main(String[] args) {

        FaceWash facewash1 = new FaceWash();
        facewash1.use();

        NeemFaceWash neemFacewash1 = new NeemFaceWash();
        neemFacewash1.use();

        FaceWash facewash2 = new NeemFaceWash();
        facewash2.use();
    }
}