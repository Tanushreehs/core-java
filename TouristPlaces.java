class TouristPlaces {

    public static void main(String[] args){

        String[] places = {
            "Bali","Maldives","Dubai","Singapore","Bangkok",
            "Kuala Lumpur","Phuket","Tokyo","Seoul","London",
            "New York","Los Angeles","San Francisco","Las Vegas","Chicago",
            "Toronto","Vancouver","Sydney","Melbourne","Auckland",
            "Rome","Venice","Barcelona","Madrid","Berlin",
            "Amsterdam","Zurich","Vienna","Prague","Budapest"
        };

        places[2] = "Istanbul";
        System.out.println("Forward:");
        for(int i=0; i<places.length; i++){
            System.out.println(places[i]);
        }
        System.out.println("\nReverse\n");
        for(int i=places.length-1; i>=0; i--){
            System.out.println(places[i]);
        }
    }
}