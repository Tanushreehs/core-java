class WoodRunner {
    public static void main(String[] args) {
        FurnitureWood wood1 = new FurnitureWood("Teak", 2000);
        FurnitureWood wood2 = new FurnitureWood("Oak", 1500); 
		System.out.println("Wood 1: Type=" + wood1.type + ", Cost=" + wood1.cost);
        System.out.println("Wood 2: Type=" + wood2.type + ", Cost=" + wood2.cost);
    }
}