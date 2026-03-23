class PlantNames {

    public static void main(String[] args){

        String[] plants = {
            "Rose","Tulsi","Money Plant","Aloe Vera","Snake Plant",
            "Areca Palm","Hibiscus","Jasmine","Marigold","Neem",
            "Mango","Coconut","Banana","Papaya","Guava",
            "Peepal","Bamboo","Curry Leaves","Mint","Spinach",
            "Tomato","Brinjal","Chilli","Coriander","Lemon"
        };

        plants[1] = "Holy Basil";
        System.out.println("Forward:");
        for(int i=0; i<plants.length; i++){
            System.out.println(plants[i]);
        }
        System.out.println("\nReverse:\n");
        for(int i=plants.length-1; i>=0; i--){
            System.out.println(plants[i]);
        }
    }
}