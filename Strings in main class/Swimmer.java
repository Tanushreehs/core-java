class Swimmer {
    public static void main(String... values) {

        System.out.println("Input values: " + values);

        if (values.length == 2) {
            System.out.println("Length is valid");

            String name = values[0];
            String height = values[1];

            double convertedHeight = Double.valueOf(height);

            if (convertedHeight >= 120.0) {
                System.out.println(name + " is eligible to swim");
            } else {
                System.out.println(name + " is not eligible to swim");
            }

        } else {
            System.out.println("Invalid number of inputs");
        }
    }
}