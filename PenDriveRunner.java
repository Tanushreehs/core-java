class PenDriveRunner {

    public static void main(String[] args) {

        System.out.println("Testing Pen Drive:");

        int size = PenDrive.getSize("HP");
        System.out.println("Returned Size: " + size + "GB");

        PenDrive.getSize("Unknown"); 
    }
}