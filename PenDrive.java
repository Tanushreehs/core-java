class PenDrive {

    static int getSize(String brand) {

        if(brand.equals("SanDisk")){
            System.out.println("SanDisk pen drive available in 32GB");
            return 32;
        }
        if(brand.equals("HP")){
            System.out.println("HP pen drive available in 64GB");
            return 64;
        }
        if(brand.equals("Sony")){
            System.out.println("Sony pen drive available in 128GB");
            return 128;
        }
        if(brand.equals("Kingston")){
            System.out.println("Kingston pen drive available in 256GB");
            return 256;
        }
        if(brand.equals("Toshiba")){
            System.out.println("Toshiba pen drive available in 16GB");
            return 16;
        }

        System.out.println("Brand not available");
        return 0;
    }
}