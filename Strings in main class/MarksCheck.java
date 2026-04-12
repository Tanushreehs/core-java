class MarksCheck {
    public static void main(String... values) {

        String marks = values[0];

        short convertedMarks = Short.valueOf(marks);

        if (convertedMarks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}