class ProjectorRunner {

    public static void main(String[] args) {

        Projector p1 = new Projector();
        Projector p2 = new Projector();
        Projector p3 = new Projector();
        Projector p4 = new Projector();
        Projector p5 = new Projector();
        Projector p6 = new Projector();
        Projector p7 = new Projector();
        Projector p8 = new Projector();
        Projector p9 = new Projector();
        Projector p10 = new Projector();

        p1.price = 15000;
        p1.model = "X100";
        p1.resolutionWidth = 1280;
        p1.resolutionHeight = 720;
        p1.projectionTechnology = "LCD";
        p1.isAvailable = true;
        p1.warranty = 2;
        p1.connectivity = "HDMI";
        p1.weight = 2.5;
        p1.compatibility = "Laptop";

        p2.price = 20000;
        p2.model = "X200";
        p2.resolutionWidth = 1920;
        p2.resolutionHeight = 1080;
        p2.projectionTechnology = "DLP";
        p2.isAvailable = true;
        p2.warranty = 3;
        p2.connectivity = "HDMI, USB";
        p2.weight = 2.8;
        p2.compatibility = "PC";

        p3.price = 25000;
        p3.model = "X300";
        p3.resolutionWidth = 1920;
        p3.resolutionHeight = 1080;
        p3.projectionTechnology = "LED";
        p3.isAvailable = false;
        p3.warranty = 2;
        p3.connectivity = "HDMI";
        p3.weight = 3.0;
        p3.compatibility = "Laptop";

        p4.price = 30000;
        p4.model = "X400";
        p4.resolutionWidth = 3840;
        p4.resolutionHeight = 2160;
        p4.projectionTechnology = "Laser";
        p4.isAvailable = true;
        p4.warranty = 4;
        p4.connectivity = "HDMI, Bluetooth";
        p4.weight = 3.5;
        p4.compatibility = "PC";

        p5.price = 35000;
        p5.model = "X500";
        p5.resolutionWidth = 3840;
        p5.resolutionHeight = 2160;
        p5.projectionTechnology = "Laser";
        p5.isAvailable = true;
        p5.warranty = 5;
        p5.connectivity = "HDMI, WiFi";
        p5.weight = 3.8;
        p5.compatibility = "Smart TV";

        p6.price = 18000;
        p6.model = "X600";
        p6.resolutionWidth = 1280;
        p6.resolutionHeight = 800;
        p6.projectionTechnology = "LCD";
        p6.isAvailable = true;
        p6.warranty = 2;
        p6.connectivity = "USB";
        p6.weight = 2.6;
        p6.compatibility = "Laptop";

        p7.price = 22000;
        p7.model = "X700";
        p7.resolutionWidth = 1920;
        p7.resolutionHeight = 1080;
        p7.projectionTechnology = "DLP";
        p7.isAvailable = true;
        p7.warranty = 3;
        p7.connectivity = "HDMI";
        p7.weight = 2.9;
        p7.compatibility = "PC";

        p8.price = 27000;
        p8.model = "X800";
        p8.resolutionWidth = 1920;
        p8.resolutionHeight = 1080;
        p8.projectionTechnology = "LED";
        p8.isAvailable = false;
        p8.warranty = 3;
        p8.connectivity = "HDMI, USB";
        p8.weight = 3.1;
        p8.compatibility = "Laptop";

        p9.price = 32000;
        p9.model = "X900";
        p9.resolutionWidth = 3840;
        p9.resolutionHeight = 2160;
        p9.projectionTechnology = "Laser";
        p9.isAvailable = true;
        p9.warranty = 4;
        p9.connectivity = "HDMI, WiFi";
        p9.weight = 3.6;
        p9.compatibility = "PC";

        p10.price = 37000;
        p10.model = "X1000";
        p10.resolutionWidth = 3840;
        p10.resolutionHeight = 2160;
        p10.projectionTechnology = "Laser";
        p10.isAvailable = true;
        p10.warranty = 5;
        p10.connectivity = "HDMI, Bluetooth";
        p10.weight = 4.0;
        p10.compatibility = "Smart TV";


        System.out.println("\nProjector1 Details");
        System.out.println("Brand: " + p1.brand);
        System.out.println("Color: " + p1.color);
        System.out.println("Brightness: " + p1.brightness);
        System.out.println("Type: " + p1.type);
        System.out.println("Supports HD: " + p1.supportsHD);
        System.out.println("Price: " + p1.price);
        System.out.println("Model: " + p1.model);
        System.out.println("Resolution: " + p1.resolutionWidth + "x" + p1.resolutionHeight);
        System.out.println("Technology: " + p1.projectionTechnology);
        System.out.println("Available: " + p1.isAvailable);
        System.out.println("Warranty: " + p1.warranty);
        System.out.println("Connectivity: " + p1.connectivity);
        System.out.println("Weight: " + p1.weight);
        System.out.println("Compatibility: " + p1.compatibility);

        System.out.println("\nProjector2 Details");
        System.out.println("Brand: " + p2.brand);
        System.out.println("Color: " + p2.color);
        System.out.println("Brightness: " + p2.brightness);
        System.out.println("Type: " + p2.type);
        System.out.println("Supports HD: " + p2.supportsHD);
        System.out.println("Price: " + p2.price);
        System.out.println("Model: " + p2.model);
        System.out.println("Resolution: " + p2.resolutionWidth + "x" + p2.resolutionHeight);
        System.out.println("Technology: " + p2.projectionTechnology);
        System.out.println("Available: " + p2.isAvailable);
        System.out.println("Warranty: " + p2.warranty);
        System.out.println("Connectivity: " + p2.connectivity);
        System.out.println("Weight: " + p2.weight);
        System.out.println("Compatibility: " + p2.compatibility);

               System.out.println("\nProjector3 Details");
        System.out.println("Brand: " + p3.brand);
        System.out.println("Color: " + p3.color);
        System.out.println("Brightness: " + p3.brightness);
        System.out.println("Type: " + p3.type);
        System.out.println("Supports HD: " + p3.supportsHD);
        System.out.println("Price: " + p3.price);
        System.out.println("Model: " + p3.model);
        System.out.println("Resolution: " + p3.resolutionWidth + "x" + p3.resolutionHeight);
        System.out.println("Technology: " + p3.projectionTechnology);
        System.out.println("Available: " + p3.isAvailable);
        System.out.println("Warranty: " + p3.warranty);
        System.out.println("Connectivity: " + p3.connectivity);
        System.out.println("Weight: " + p3.weight);
        System.out.println("Compatibility: " + p3.compatibility);

        System.out.println("\nProjector4 Details");
        System.out.println("Brand: " + p4.brand);
        System.out.println("Color: " + p4.color);
        System.out.println("Brightness: " + p4.brightness);
        System.out.println("Type: " + p4.type);
        System.out.println("Supports HD: " + p4.supportsHD);
        System.out.println("Price: " + p4.price);
        System.out.println("Model: " + p4.model);
        System.out.println("Resolution: " + p4.resolutionWidth + "x" + p4.resolutionHeight);
        System.out.println("Technology: " + p4.projectionTechnology);
        System.out.println("Available: " + p4.isAvailable);
        System.out.println("Warranty: " + p4.warranty);
        System.out.println("Connectivity: " + p4.connectivity);
        System.out.println("Weight: " + p4.weight);
        System.out.println("Compatibility: " + p4.compatibility);

        System.out.println("\nProjector5 Details");
        System.out.println("Brand: " + p5.brand);
        System.out.println("Color: " + p5.color);
        System.out.println("Brightness: " + p5.brightness);
        System.out.println("Type: " + p5.type);
        System.out.println("Supports HD: " + p5.supportsHD);
        System.out.println("Price: " + p5.price);
        System.out.println("Model: " + p5.model);
        System.out.println("Resolution: " + p5.resolutionWidth + "x" + p5.resolutionHeight);
        System.out.println("Technology: " + p5.projectionTechnology);
        System.out.println("Available: " + p5.isAvailable);
        System.out.println("Warranty: " + p5.warranty);
        System.out.println("Connectivity: " + p5.connectivity);
        System.out.println("Weight: " + p5.weight);
        System.out.println("Compatibility: " + p5.compatibility);

        System.out.println("\nProjector6 Details");
        System.out.println("Brand: " + p6.brand);
        System.out.println("Color: " + p6.color);
        System.out.println("Brightness: " + p6.brightness);
        System.out.println("Type: " + p6.type);
        System.out.println("Supports HD: " + p6.supportsHD);
        System.out.println("Price: " + p6.price);
        System.out.println("Model: " + p6.model);
        System.out.println("Resolution: " + p6.resolutionWidth + "x" + p6.resolutionHeight);
        System.out.println("Technology: " + p6.projectionTechnology);
        System.out.println("Available: " + p6.isAvailable);
        System.out.println("Warranty: " + p6.warranty);
        System.out.println("Connectivity: " + p6.connectivity);
        System.out.println("Weight: " + p6.weight);
        System.out.println("Compatibility: " + p6.compatibility);

        System.out.println("\nProjector7 Details");
        System.out.println("Brand: " + p7.brand);
        System.out.println("Color: " + p7.color);
        System.out.println("Brightness: " + p7.brightness);
        System.out.println("Type: " + p7.type);
        System.out.println("Supports HD: " + p7.supportsHD);
        System.out.println("Price: " + p7.price);
        System.out.println("Model: " + p7.model);
        System.out.println("Resolution: " + p7.resolutionWidth + "x" + p7.resolutionHeight);
        System.out.println("Technology: " + p7.projectionTechnology);
        System.out.println("Available: " + p7.isAvailable);
        System.out.println("Warranty: " + p7.warranty);
        System.out.println("Connectivity: " + p7.connectivity);
        System.out.println("Weight: " + p7.weight);
        System.out.println("Compatibility: " + p7.compatibility);

        System.out.println("\nProjector8 Details");
        System.out.println("Brand: " + p8.brand);
        System.out.println("Color: " + p8.color);
        System.out.println("Brightness: " + p8.brightness);
        System.out.println("Type: " + p8.type);
        System.out.println("Supports HD: " + p8.supportsHD);
        System.out.println("Price: " + p8.price);
        System.out.println("Model: " + p8.model);
        System.out.println("Resolution: " + p8.resolutionWidth + "x" + p8.resolutionHeight);
        System.out.println("Technology: " + p8.projectionTechnology);
        System.out.println("Available: " + p8.isAvailable);
        System.out.println("Warranty: " + p8.warranty);
        System.out.println("Connectivity: " + p8.connectivity);
        System.out.println("Weight: " + p8.weight);
        System.out.println("Compatibility: " + p8.compatibility);

        System.out.println("\nProjector9 Details");
        System.out.println("Brand: " + p9.brand);
        System.out.println("Color: " + p9.color);
        System.out.println("Brightness: " + p9.brightness);
        System.out.println("Type: " + p9.type);
        System.out.println("Supports HD: " + p9.supportsHD);
        System.out.println("Price: " + p9.price);
        System.out.println("Model: " + p9.model);
        System.out.println("Resolution: " + p9.resolutionWidth + "x" + p9.resolutionHeight);
        System.out.println("Technology: " + p9.projectionTechnology);
        System.out.println("Available: " + p9.isAvailable);
        System.out.println("Warranty: " + p9.warranty);
        System.out.println("Connectivity: " + p9.connectivity);
        System.out.println("Weight: " + p9.weight);
        System.out.println("Compatibility: " + p9.compatibility);

        System.out.println("\nProjector10 Details");
        System.out.println("Brand: " + p10.brand);
        System.out.println("Color: " + p10.color);
        System.out.println("Brightness: " + p10.brightness);
        System.out.println("Type: " + p10.type);
        System.out.println("Supports HD: " + p10.supportsHD);
        System.out.println("Price: " + p10.price);
        System.out.println("Model: " + p10.model);
        System.out.println("Resolution: " + p10.resolutionWidth + "x" + p10.resolutionHeight);
        System.out.println("Technology: " + p10.projectionTechnology);
        System.out.println("Available: " + p10.isAvailable);
        System.out.println("Warranty: " + p10.warranty);
        System.out.println("Connectivity: " + p10.connectivity);
        System.out.println("Weight: " + p10.weight);
        System.out.println("Compatibility: " + p10.compatibility);

    }
}