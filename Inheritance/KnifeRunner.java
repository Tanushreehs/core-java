class KnifeRunner {
    public static void main(String[] args) {
        KitchenKnife knife1 = new KitchenKnife("Steel", 10);
        KitchenKnife knife2 = new KitchenKnife("Iron", 8);
        System.out.println("Knife 1: Material=" + knife1.material + ", Length=" + knife1.length);
        System.out.println("Knife 2: Material=" + knife2.material + ", Length=" + knife2.length);
    }
}