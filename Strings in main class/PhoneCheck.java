class PhoneCheck {
    public static void main(String... values) {

        String phone = values[0];

        long number = Long.valueOf(phone);

        if (String.valueOf(number).length() == 10) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
        }
    }
}