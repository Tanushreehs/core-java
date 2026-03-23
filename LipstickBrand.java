class LipstickBrand {
    public static void main(String[] args){

        String[] brands = {
            "Huda Beauty","Fenty Beauty","Charlotte Tilbury","Dior","NARS",
            "Rare Beauty","Pat McGrath","Estee Lauder","YSL","Clinique"
        };

        brands[3] = "Givenchy";

        System.out.println("Forward:");
        for(int i=0; i<brands.length; i++){
            System.out.println(brands[i]);
        }

        System.out.println("\nReverse:\n");
        for(int i=brands.length-1; i>=0; i--){
            System.out.println(brands[i]);
        }
    }
}