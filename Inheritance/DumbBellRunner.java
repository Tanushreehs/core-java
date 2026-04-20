class DumbBellRunner {
    public static void main(String[] args) {
        GymDumbBell dumbBell1 = new GymDumbBell(10, "Iron");
        GymDumbBell dumbBell2 = new GymDumbBell(15, "Rubber");
        System.out.println("DumbBell 1: Weight=" + dumbBell1.weight + ", Material=" + dumbBell1.material);
        System.out.println("DumbBell 2: Weight=" + dumbBell2.weight + ", Material=" + dumbBell2.material);
    }
}