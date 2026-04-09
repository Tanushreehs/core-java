class FlowerRunner {

    public static void main(String... args) {

        FlowerRun flowerRun = new FlowerRun("Rose", 20);

        Flower flower = flowerRun.info();

        flowerRun.show();
        flower.details();
    }
}