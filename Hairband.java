public class Hairband {
    public static void main(String[] args) {
        String color = "Pink";
        String material = "Elastic";
        double thicknessMm = 5.0;
        boolean isUsed = false;
        int packQuantity = 12;

        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Thickness: " + thicknessMm);
        System.out.println("Is Used: " + isUsed);
        System.out.println("Pack Size: " + packQuantity);

        color = "Black";
        material = "Plastic";
        thicknessMm = 10.0;
        isUsed = true;
        packQuantity = 1;

        System.out.println("New Color: " + color);
        System.out.println("New Material: " + material);
        System.out.println("New Thickness: " + thicknessMm);
        System.out.println("New Is Used: " + isUsed);
        System.out.println("New Pack Size: " + packQuantity);
    }
}