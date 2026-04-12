class TemperatureCheck {
    public static void main(String... values) {

        String temp = values[0];

        byte temperature = Byte.valueOf(temp);

        if (temperature > 30) {
            System.out.println("Hot weather");
        } else {
            System.out.println("Cool weather");
        }
    }
}