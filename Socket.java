public class Socket {
    public static void main(String[] args) {
        String type = "3-pin";
        int voltage = 240;
        String color = "White";
        boolean isSwitchedOn = false;
        double price = 150.0;

        System.out.println("Socket Type: " + type);
        System.out.println("Voltage: " + voltage);
        System.out.println("Color: " + color);
        System.out.println("Is Switched On: " + isSwitchedOn);
        System.out.println("Price: " + price);

        type = "2-pin";
        voltage = 110;
        color = "Grey";
        isSwitchedOn = true;
        price = 120.5;

        System.out.println("Updated Socket Type: " + type);
        System.out.println("Updated Voltage: " + voltage);
        System.out.println("Updated Color: " + color);
        System.out.println("Updated Is Switched On: " + isSwitchedOn);
        System.out.println("Updated Price: " + price);
    }
}