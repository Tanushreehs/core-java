class GunModels {

    public static void main(String[] args){

        String[] guns = {
            "Canon EOS R5","Nikon D850","Sony Alpha A7 III","Fujifilm X-T4","Panasonic Lumix GH5",
            "Olympus OM-D E-M10","Leica Q2","Pentax K-1","GoPro HERO11","DJI Osmo Action",
            "Canon EOS 90D","Nikon Z6","Sony Alpha A6400","Fujifilm X100V","Panasonic Lumix S5",
            "Olympus Tough TG-6","Leica SL2","Pentax KP","GoPro HERO10","DJI Pocket 2",
            "Canon EOS Rebel T7","Nikon D7500","Sony Alpha A6600","Fujifilm X-S10","Panasonic Lumix G9",
            "Olympus OM-D E-M5","Leica CL","Pentax K-70","GoPro MAX","DJI Mini 3 Pro"
        };

        guns[4] = "Sony Alpha A7 IV";

        System.out.println("Forward:");
        for(int i=0; i<guns.length; i++){
            System.out.println(guns[i]);
        }

        System.out.println("Reverse:");
        for(int i=guns.length-1; i>=0; i--){
            System.out.println(guns[i]);
        }
    }
}