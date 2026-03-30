class GraphicCardRunner {

    public static void main(String[] args) {

        GraphicCard g1 = new GraphicCard();
        GraphicCard g2 = new GraphicCard();
        GraphicCard g3 = new GraphicCard();
        GraphicCard g4 = new GraphicCard();
        GraphicCard g5 = new GraphicCard();
        GraphicCard g6 = new GraphicCard();
        GraphicCard g7 = new GraphicCard();
        GraphicCard g8 = new GraphicCard();
        GraphicCard g9 = new GraphicCard();
        GraphicCard g10 = new GraphicCard();

        g1.price = 20000;
        g1.model = "RTX3050";
        g1.cores = 2560;
        g1.clockSpeed = 1.5;
        g1.architecture = "Ampere";
        g1.isAvailable = true;
        g1.warranty = 2;
        g1.coolingType = "Air";
        g1.weight = 1.2;
        g1.compatibility = "PC";
		
        g2.price = 25000;
        g2.model = "RTX3060";
        g2.cores = 3584;
        g2.clockSpeed = 1.7;
        g2.architecture = "Ampere";
        g2.isAvailable = true;
        g2.warranty = 3;
        g2.coolingType = "Air";
        g2.weight = 1.3;
        g2.compatibility = "PC";

        g3.price = 30000;
        g3.model = "RTX3070";
        g3.cores = 5888;
        g3.clockSpeed = 1.8;
        g3.architecture = "Ampere";
        g3.isAvailable = false;
        g3.warranty = 3;
        g3.coolingType = "Liquid";
        g3.weight = 1.5;
        g3.compatibility = "PC";
		
        g4.price = 35000;
        g4.model = "RTX3080";
        g4.cores = 8704;
        g4.clockSpeed = 1.9;
        g4.architecture = "Ampere";
        g4.isAvailable = true;
        g4.warranty = 4;
        g4.coolingType = "Liquid";
        g4.weight = 1.6;
        g4.compatibility = "PC";

        g5.price = 40000;
        g5.model = "RTX3090";
        g5.cores = 10496;
        g5.clockSpeed = 2.0;
        g5.architecture = "Ampere";
        g5.isAvailable = true;
        g5.warranty = 5;
        g5.coolingType = "Liquid";
        g5.weight = 1.8;
        g5.compatibility = "PC";

        g6.price = 45000;
        g6.model = "RTX4060";
        g6.cores = 3072;
        g6.clockSpeed = 2.1;
        g6.architecture = "Ada";
        g6.isAvailable = true;
        g6.warranty = 3;
        g6.coolingType = "Air";
        g6.weight = 1.4;
        g6.compatibility = "PC";

        g7.price = 50000;
        g7.model = "RTX4070";
        g7.cores = 5888;
        g7.clockSpeed = 2.2;
        g7.architecture = "Ada";
        g7.isAvailable = true;
        g7.warranty = 4;
        g7.coolingType = "Air";
        g7.weight = 1.5;
        g7.compatibility = "PC";

        g8.price = 55000;
        g8.model = "RTX4080";
        g8.cores = 9728;
        g8.clockSpeed = 2.3;
        g8.architecture = "Ada";
        g8.isAvailable = false;
        g8.warranty = 4;
        g8.coolingType = "Liquid";
        g8.weight = 1.7;
        g8.compatibility = "PC";

        g9.price = 60000;
        g9.model = "RTX4090";
        g9.cores = 16384;
        g9.clockSpeed = 2.4;
        g9.architecture = "Ada";
        g9.isAvailable = true;
        g9.warranty = 5;
        g9.coolingType = "Liquid";
        g9.weight = 2.0;
        g9.compatibility = "PC";
		
        g10.price = 65000;
        g10.model = "GTX1660";
        g10.cores = 1408;
        g10.clockSpeed = 1.6;
        g10.architecture = "Turing";
        g10.isAvailable = true;
        g10.warranty = 2;
        g10.coolingType = "Air";
        g10.weight = 1.2;
        g10.compatibility = "PC";

        System.out.println("\nGraphicCard1 Details");
        System.out.println("Brand: " + g1.brand);
        System.out.println("Color: " + g1.color);
        System.out.println("Memory: " + g1.memory);
        System.out.println("Type: " + g1.type);
        System.out.println("Ray Tracing: " + g1.supportsRayTracing);
        System.out.println("Price: " + g1.price);
        System.out.println("Model: " + g1.model);
        System.out.println("Cores: " + g1.cores);
        System.out.println("Clock Speed: " + g1.clockSpeed);
        System.out.println("Architecture: " + g1.architecture);
        System.out.println("Available: " + g1.isAvailable);
        System.out.println("Warranty: " + g1.warranty);
        System.out.println("Cooling: " + g1.coolingType);
        System.out.println("Weight: " + g1.weight);
        System.out.println("Compatibility: " + g1.compatibility);
		
		System.out.println("\nGraphicCard2 Details");
        System.out.println("Brand: " + g2.brand);
        System.out.println("Color: " + g2.color);
        System.out.println("Memory: " + g2.memory);
        System.out.println("Type: " + g2.type);
        System.out.println("Ray Tracing: " + g2.supportsRayTracing);
        System.out.println("Price: " + g2.price);
        System.out.println("Model: " + g2.model);
        System.out.println("Cores: " + g2.cores);
        System.out.println("Clock Speed: " + g2.clockSpeed);
        System.out.println("Architecture: " + g2.architecture);
        System.out.println("Available: " + g2.isAvailable);
        System.out.println("Warranty: " + g2.warranty);
        System.out.println("Cooling: " + g2.coolingType);
        System.out.println("Weight: " + g2.weight);
        System.out.println("Compatibility: " + g2.compatibility);

        System.out.println("\nGraphicCard3 Details");
        System.out.println("Brand: " + g3.brand);
        System.out.println("Color: " + g3.color);
        System.out.println("Memory: " + g3.memory);
        System.out.println("Type: " + g3.type);
        System.out.println("Ray Tracing: " + g3.supportsRayTracing);
        System.out.println("Price: " + g3.price);
        System.out.println("Model: " + g3.model);
        System.out.println("Cores: " + g3.cores);
        System.out.println("Clock Speed: " + g3.clockSpeed);
        System.out.println("Architecture: " + g3.architecture);
        System.out.println("Available: " + g3.isAvailable);
        System.out.println("Warranty: " + g3.warranty);
        System.out.println("Cooling: " + g3.coolingType);
        System.out.println("Weight: " + g3.weight);
        System.out.println("Compatibility: " + g3.compatibility);

        System.out.println("\nGraphicCard4 Details");
        System.out.println("Brand: " + g4.brand);
        System.out.println("Color: " + g4.color);
        System.out.println("Memory: " + g4.memory);
        System.out.println("Type: " + g4.type);
        System.out.println("Ray Tracing: " + g4.supportsRayTracing);
        System.out.println("Price: " + g4.price);
        System.out.println("Model: " + g4.model);
        System.out.println("Cores: " + g4.cores);
        System.out.println("Clock Speed: " + g4.clockSpeed);
        System.out.println("Architecture: " + g4.architecture);
        System.out.println("Available: " + g4.isAvailable);
        System.out.println("Warranty: " + g4.warranty);
        System.out.println("Cooling: " + g4.coolingType);
        System.out.println("Weight: " + g4.weight);
        System.out.println("Compatibility: " + g4.compatibility);

        System.out.println("\nGraphicCard5 Details");
        System.out.println("Brand: " + g5.brand);
        System.out.println("Color: " + g5.color);
        System.out.println("Memory: " + g5.memory);
        System.out.println("Type: " + g5.type);
        System.out.println("Ray Tracing: " + g5.supportsRayTracing);
        System.out.println("Price: " + g5.price);
        System.out.println("Model: " + g5.model);
        System.out.println("Cores: " + g5.cores);
        System.out.println("Clock Speed: " + g5.clockSpeed);
        System.out.println("Architecture: " + g5.architecture);
        System.out.println("Available: " + g5.isAvailable);
        System.out.println("Warranty: " + g5.warranty);
        System.out.println("Cooling: " + g5.coolingType);
        System.out.println("Weight: " + g5.weight);
        System.out.println("Compatibility: " + g5.compatibility);

        System.out.println("\nGraphicCard6 Details");
        System.out.println("Brand: " + g6.brand);
        System.out.println("Color: " + g6.color);
        System.out.println("Memory: " + g6.memory);
        System.out.println("Type: " + g6.type);
        System.out.println("Ray Tracing: " + g6.supportsRayTracing);
        System.out.println("Price: " + g6.price);
        System.out.println("Model: " + g6.model);
        System.out.println("Cores: " + g6.cores);
        System.out.println("Clock Speed: " + g6.clockSpeed);
        System.out.println("Architecture: " + g6.architecture);
        System.out.println("Available: " + g6.isAvailable);
        System.out.println("Warranty: " + g6.warranty);
        System.out.println("Cooling: " + g6.coolingType);
        System.out.println("Weight: " + g6.weight);
        System.out.println("Compatibility: " + g6.compatibility);

        System.out.println("\nGraphicCard7 Details");
        System.out.println("Brand: " + g7.brand);
        System.out.println("Color: " + g7.color);
        System.out.println("Memory: " + g7.memory);
        System.out.println("Type: " + g7.type);
        System.out.println("Ray Tracing: " + g7.supportsRayTracing);
        System.out.println("Price: " + g7.price);
        System.out.println("Model: " + g7.model);
        System.out.println("Cores: " + g7.cores);
        System.out.println("Clock Speed: " + g7.clockSpeed);
        System.out.println("Architecture: " + g7.architecture);
        System.out.println("Available: " + g7.isAvailable);
        System.out.println("Warranty: " + g7.warranty);
        System.out.println("Cooling: " + g7.coolingType);
        System.out.println("Weight: " + g7.weight);
        System.out.println("Compatibility: " + g7.compatibility);

        System.out.println("\nGraphicCard8 Details");
        System.out.println("Brand: " + g8.brand);
        System.out.println("Color: " + g8.color);
        System.out.println("Memory: " + g8.memory);
        System.out.println("Type: " + g8.type);
        System.out.println("Ray Tracing: " + g8.supportsRayTracing);
        System.out.println("Price: " + g8.price);
        System.out.println("Model: " + g8.model);
        System.out.println("Cores: " + g8.cores);
        System.out.println("Clock Speed: " + g8.clockSpeed);
        System.out.println("Architecture: " + g8.architecture);
        System.out.println("Available: " + g8.isAvailable);
        System.out.println("Warranty: " + g8.warranty);
        System.out.println("Cooling: " + g8.coolingType);
        System.out.println("Weight: " + g8.weight);
        System.out.println("Compatibility: " + g8.compatibility);

        System.out.println("\nGraphicCard9 Details");
        System.out.println("Brand: " + g9.brand);
        System.out.println("Color: " + g9.color);
        System.out.println("Memory: " + g9.memory);
        System.out.println("Type: " + g9.type);
        System.out.println("Ray Tracing: " + g9.supportsRayTracing);
        System.out.println("Price: " + g9.price);
        System.out.println("Model: " + g9.model);
        System.out.println("Cores: " + g9.cores);
        System.out.println("Clock Speed: " + g9.clockSpeed);
        System.out.println("Architecture: " + g9.architecture);
        System.out.println("Available: " + g9.isAvailable);
        System.out.println("Warranty: " + g9.warranty);
        System.out.println("Cooling: " + g9.coolingType);
        System.out.println("Weight: " + g9.weight);
        System.out.println("Compatibility: " + g9.compatibility);

        System.out.println("\nGraphicCard10 Details");
        System.out.println("Brand: " + g10.brand);
        System.out.println("Color: " + g10.color);
        System.out.println("Memory: " + g10.memory);
        System.out.println("Type: " + g10.type);
        System.out.println("Ray Tracing: " + g10.supportsRayTracing);
        System.out.println("Price: " + g10.price);
        System.out.println("Model: " + g10.model);
        System.out.println("Cores: " + g10.cores);
        System.out.println("Clock Speed: " + g10.clockSpeed);
        System.out.println("Architecture: " + g10.architecture);
        System.out.println("Available: " + g10.isAvailable);
        System.out.println("Warranty: " + g10.warranty);
        System.out.println("Cooling: " + g10.coolingType);
        System.out.println("Weight: " + g10.weight);
        System.out.println("Compatibility: " + g10.compatibility);

    

    }
}