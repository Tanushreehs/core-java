class WeightCheck {
    public static void main(String... values) {

        String name = values[0];
        String weight = values[1];

        float convertedWeight = Float.valueOf(weight);

        if (convertedWeight >= 40.0f) {
            System.out.println(name + " is fit for sports");
        } else {
            System.out.println(name + " is underweight");
        }
    }
}