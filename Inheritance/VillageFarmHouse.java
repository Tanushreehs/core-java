class VillageFarmHouse extends FarmHouse {
    String swimmingPool;
	VillageFarmHouse(String ownerName, int landSize, String swimmingPool) {
        super(ownerName, landSize);
        this.swimmingPool = swimmingPool;
        System.out.println("Village FarmHouse constructor");
    }
}