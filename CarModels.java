class CarModels {

    public static void main(String[] args){

        String[] cars = {
            "Swift","Baleno","WagonR","Alto","i10",
            "i20","Creta","Venue","City","Amaze",
            "Fortuner","Innova","Scorpio","Thar","Nexon",
            "Punch","Harrier","Altroz","Seltos","Sonet",
            "Ertiga","XL6","Glanza","Kwid","Magnite"
        };

        cars[5] = "Dzire";
        System.out.println("Forward:");
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("\nReverse:\n");
        for(int i=cars.length-1; i>=0; i--){
            System.out.println(cars[i]);
        }
    }
}