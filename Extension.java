public class Extension {
    public static void main(String[] args) {
        int socketsCount = 4;
        double cordLength = 3.0;
        boolean hasSurgeProtection = true;
        String brand = "Belkin";
        int maxLoadAmps = 10;

        System.out.println("Sockets: " + socketsCount);
        System.out.println("Length: " + cordLength);
        System.out.println("Surge Protection: " + hasSurgeProtection);
        System.out.println("Brand: " + brand);
        System.out.println("Max Load: " + maxLoadAmps);

        socketsCount = 6;
        cordLength = 5.5;
        hasSurgeProtection = false;
        brand = "Generic";
        maxLoadAmps = 15;

        System.out.println("New Sockets: " + socketsCount);
        System.out.println("New Length: " + cordLength);
        System.out.println("New Surge Protection: " + hasSurgeProtection);
        System.out.println("New Brand: " + brand);
        System.out.println("New Max Load: " + maxLoadAmps);
    }
}