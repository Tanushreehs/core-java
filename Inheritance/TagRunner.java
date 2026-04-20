class TagRunner {
    public static void main(String[] args) {
        PriceTag tag1 = new PriceTag("Sale", 101);
        PriceTag tag2 = new PriceTag("Offer", 102);
        System.out.println("Tag 1: Label=" + tag1.label + ", ID=" + tag1.id);
        System.out.println("Tag 2: Label=" + tag2.label + ", ID=" + tag2.id);
    }
}