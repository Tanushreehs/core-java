public class Wall {
    public static void main(String[] args) {
        String material = "Brick";
        double height = 10.5;
        double width = 15.0;
        String paintColor = "Beige";
        int numberOfHooks = 2;

        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Paint Color: " + paintColor);
        System.out.println("Hooks: " + numberOfHooks);

        material = "Concrete";
        height = 12.0;
        width = 20.0;
        paintColor = "White";
        numberOfHooks = 5;

        System.out.println("New Material: " + material);
        System.out.println("New Height: " + height);
        System.out.println("New Width: " + width);
        System.out.println("New Paint Color: " + paintColor);
        System.out.println("New Hooks: " + numberOfHooks);
    }
}