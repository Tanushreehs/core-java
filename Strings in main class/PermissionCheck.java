class PermissionCheck {
    public static void main(String... values) {

        String permission = values[0];

        boolean isAllowed = Boolean.valueOf(permission);

        if (isAllowed) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
