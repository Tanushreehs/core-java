class JuiceRunner {
    public static void main(String[] args) {
        Juice juice = new Juice();

        juice.save("Orange");
        juice.save("Apple");
        juice.save("Mango");
        juice.save("Grape");
        juice.save("Pineapple");

        juice.search("Mango");
    }
}