class Restaurant {
    String hotelName;
    String hotelCity;
    Restaurant() {
        this("TajHotel", "HassanCity");
        System.out.println("Default Restaurant");
    }
    Restaurant(String hotelName, String hotelCity) {
        this.hotelName = hotelName;
        this.hotelCity = hotelCity;
        System.out.println("Parameterized Restaurant");
    }
}