class XboxRunner {

    public static void main(String[] args) {

        Xbox x1 = new Xbox();
        Xbox x2 = new Xbox();
        Xbox x3 = new Xbox();
        Xbox x4 = new Xbox();
        Xbox x5 = new Xbox();
        Xbox x6 = new Xbox();
        Xbox x7 = new Xbox();
        Xbox x8 = new Xbox();
        Xbox x9 = new Xbox();
        Xbox x10 = new Xbox();

        x1.price = 30000;
        x1.model = "Series S";
        x1.controllers = 1;
        x1.weight = 1.9;
        x1.processor = "AMD Zen 2";
        x1.isAvailable = true;
        x1.warranty = 2;
        x1.connectivity = "WiFi, HDMI";
        x1.compatibility = "TV";

        x2.price = 50000;
        x2.model = "Series X";
        x2.controllers = 2;
        x2.weight = 4.5;
        x2.processor = "AMD Zen 2";
        x2.isAvailable = true;
        x2.warranty = 3;
        x2.connectivity = "WiFi, HDMI";
        x2.compatibility = "TV";

        x3.price = 28000;
        x3.model = "One S";
        x3.controllers = 1;
        x3.weight = 2.0;
        x3.processor = "AMD Jaguar";
        x3.isAvailable = false;
        x3.warranty = 2;
        x3.connectivity = "HDMI";
        x3.compatibility = "TV";

        x4.price = 35000;
        x4.model = "One X";
        x4.controllers = 2;
        x4.weight = 3.8;
        x4.processor = "AMD Jaguar";
        x4.isAvailable = true;
        x4.warranty = 3;
        x4.connectivity = "WiFi, HDMI";
        x4.compatibility = "TV";

        x5.price = 32000;
        x5.model = "Series S Carbon";
        x5.controllers = 1;
        x5.weight = 2.1;
        x5.processor = "AMD Zen 2";
        x5.isAvailable = true;
        x5.warranty = 3;
        x5.connectivity = "WiFi";
        x5.compatibility = "TV";

        x6.price = 52000;
        x6.model = "Series X Pro";
        x6.controllers = 2;
        x6.weight = 4.8;
        x6.processor = "AMD Zen 3";
        x6.isAvailable = true;
        x6.warranty = 4;
        x6.connectivity = "WiFi, HDMI";
        x6.compatibility = "TV";

        x7.price = 27000;
        x7.model = "One Digital";
        x7.controllers = 1;
        x7.weight = 2.0;
        x7.processor = "AMD Jaguar";
        x7.isAvailable = false;
        x7.warranty = 2;
        x7.connectivity = "HDMI";
        x7.compatibility = "TV";

        x8.price = 48000;
        x8.model = "Series X Elite";
        x8.controllers = 2;
        x8.weight = 4.6;
        x8.processor = "AMD Zen 2";
        x8.isAvailable = true;
        x8.warranty = 3;
        x8.connectivity = "WiFi, HDMI";
        x8.compatibility = "TV";

        x9.price = 55000;
        x9.model = "Series X Max";
        x9.controllers = 2;
        x9.weight = 5.0;
        x9.processor = "AMD Zen 3";
        x9.isAvailable = true;
        x9.warranty = 5;
        x9.connectivity = "WiFi, HDMI";
        x9.compatibility = "TV";

        x10.price = 26000;
        x10.model = "One Slim";
        x10.controllers = 1;
        x10.weight = 1.8;
        x10.processor = "AMD Jaguar";
        x10.isAvailable = true;
        x10.warranty = 2;
        x10.connectivity = "HDMI";
        x10.compatibility = "TV";


        System.out.println("\nXbox1 Details");
        System.out.println("Brand: " + x1.brand);
        System.out.println("Color: " + x1.color);
        System.out.println("Type: " + x1.type);
        System.out.println("Supports 4K: " + x1.supports4K);
        System.out.println("Storage: " + x1.storage);
        System.out.println("Price: " + x1.price);
        System.out.println("Model: " + x1.model);
        System.out.println("Controllers: " + x1.controllers);
        System.out.println("Weight: " + x1.weight);
        System.out.println("Processor: " + x1.processor);
        System.out.println("Available: " + x1.isAvailable);
        System.out.println("Warranty: " + x1.warranty);
        System.out.println("Connectivity: " + x1.connectivity);
        System.out.println("Compatibility: " + x1.compatibility);

        System.out.println("\nXbox2 Details");
        System.out.println("Brand: " + x2.brand);
        System.out.println("Color: " + x2.color);
        System.out.println("Type: " + x2.type);
        System.out.println("Supports 4K: " + x2.supports4K);
        System.out.println("Storage: " + x2.storage);
        System.out.println("Price: " + x2.price);
        System.out.println("Model: " + x2.model);
        System.out.println("Controllers: " + x2.controllers);
        System.out.println("Weight: " + x2.weight);
        System.out.println("Processor: " + x2.processor);
        System.out.println("Available: " + x2.isAvailable);
        System.out.println("Warranty: " + x2.warranty);
        System.out.println("Connectivity: " + x2.connectivity);
        System.out.println("Compatibility: " + x2.compatibility);
		        System.out.println("\nXbox3 Details");
        System.out.println("Brand: " + x3.brand);
        System.out.println("Color: " + x3.color);
        System.out.println("Type: " + x3.type);
        System.out.println("Supports 4K: " + x3.supports4K);
        System.out.println("Storage: " + x3.storage);
        System.out.println("Price: " + x3.price);
        System.out.println("Model: " + x3.model);
        System.out.println("Controllers: " + x3.controllers);
        System.out.println("Weight: " + x3.weight);
        System.out.println("Processor: " + x3.processor);
        System.out.println("Available: " + x3.isAvailable);
        System.out.println("Warranty: " + x3.warranty);
        System.out.println("Connectivity: " + x3.connectivity);
        System.out.println("Compatibility: " + x3.compatibility);

        System.out.println("\nXbox4 Details");
        System.out.println("Brand: " + x4.brand);
        System.out.println("Color: " + x4.color);
        System.out.println("Type: " + x4.type);
        System.out.println("Supports 4K: " + x4.supports4K);
        System.out.println("Storage: " + x4.storage);
        System.out.println("Price: " + x4.price);
        System.out.println("Model: " + x4.model);
        System.out.println("Controllers: " + x4.controllers);
        System.out.println("Weight: " + x4.weight);
        System.out.println("Processor: " + x4.processor);
        System.out.println("Available: " + x4.isAvailable);
        System.out.println("Warranty: " + x4.warranty);
        System.out.println("Connectivity: " + x4.connectivity);
        System.out.println("Compatibility: " + x4.compatibility);

        System.out.println("\nXbox5 Details");
        System.out.println("Brand: " + x5.brand);
        System.out.println("Color: " + x5.color);
        System.out.println("Type: " + x5.type);
        System.out.println("Supports 4K: " + x5.supports4K);
        System.out.println("Storage: " + x5.storage);
        System.out.println("Price: " + x5.price);
        System.out.println("Model: " + x5.model);
        System.out.println("Controllers: " + x5.controllers);
        System.out.println("Weight: " + x5.weight);
        System.out.println("Processor: " + x5.processor);
        System.out.println("Available: " + x5.isAvailable);
        System.out.println("Warranty: " + x5.warranty);
        System.out.println("Connectivity: " + x5.connectivity);
        System.out.println("Compatibility: " + x5.compatibility);

        System.out.println("\nXbox6 Details");
        System.out.println("Brand: " + x6.brand);
        System.out.println("Color: " + x6.color);
        System.out.println("Type: " + x6.type);
        System.out.println("Supports 4K: " + x6.supports4K);
        System.out.println("Storage: " + x6.storage);
        System.out.println("Price: " + x6.price);
        System.out.println("Model: " + x6.model);
        System.out.println("Controllers: " + x6.controllers);
        System.out.println("Weight: " + x6.weight);
        System.out.println("Processor: " + x6.processor);
        System.out.println("Available: " + x6.isAvailable);
        System.out.println("Warranty: " + x6.warranty);
        System.out.println("Connectivity: " + x6.connectivity);
        System.out.println("Compatibility: " + x6.compatibility);

        System.out.println("\nXbox7 Details");
        System.out.println("Brand: " + x7.brand);
        System.out.println("Color: " + x7.color);
        System.out.println("Type: " + x7.type);
        System.out.println("Supports 4K: " + x7.supports4K);
        System.out.println("Storage: " + x7.storage);
        System.out.println("Price: " + x7.price);
        System.out.println("Model: " + x7.model);
        System.out.println("Controllers: " + x7.controllers);
        System.out.println("Weight: " + x7.weight);
        System.out.println("Processor: " + x7.processor);
        System.out.println("Available: " + x7.isAvailable);
        System.out.println("Warranty: " + x7.warranty);
        System.out.println("Connectivity: " + x7.connectivity);
        System.out.println("Compatibility: " + x7.compatibility);

        System.out.println("\nXbox8 Details");
        System.out.println("Brand: " + x8.brand);
        System.out.println("Color: " + x8.color);
        System.out.println("Type: " + x8.type);
        System.out.println("Supports 4K: " + x8.supports4K);
        System.out.println("Storage: " + x8.storage);
        System.out.println("Price: " + x8.price);
        System.out.println("Model: " + x8.model);
        System.out.println("Controllers: " + x8.controllers);
        System.out.println("Weight: " + x8.weight);
        System.out.println("Processor: " + x8.processor);
        System.out.println("Available: " + x8.isAvailable);
        System.out.println("Warranty: " + x8.warranty);
        System.out.println("Connectivity: " + x8.connectivity);
        System.out.println("Compatibility: " + x8.compatibility);

        System.out.println("\nXbox9 Details");
        System.out.println("Brand: " + x9.brand);
        System.out.println("Color: " + x9.color);
        System.out.println("Type: " + x9.type);
        System.out.println("Supports 4K: " + x9.supports4K);
        System.out.println("Storage: " + x9.storage);
        System.out.println("Price: " + x9.price);
        System.out.println("Model: " + x9.model);
        System.out.println("Controllers: " + x9.controllers);
        System.out.println("Weight: " + x9.weight);
        System.out.println("Processor: " + x9.processor);
        System.out.println("Available: " + x9.isAvailable);
        System.out.println("Warranty: " + x9.warranty);
        System.out.println("Connectivity: " + x9.connectivity);
        System.out.println("Compatibility: " + x9.compatibility);

        System.out.println("\nXbox10 Details");
        System.out.println("Brand: " + x10.brand);
        System.out.println("Color: " + x10.color);
        System.out.println("Type: " + x10.type);
        System.out.println("Supports 4K: " + x10.supports4K);
        System.out.println("Storage: " + x10.storage);
        System.out.println("Price: " + x10.price);
        System.out.println("Model: " + x10.model);
        System.out.println("Controllers: " + x10.controllers);
        System.out.println("Weight: " + x10.weight);
        System.out.println("Processor: " + x10.processor);
        System.out.println("Available: " + x10.isAvailable);
        System.out.println("Warranty: " + x10.warranty);
        System.out.println("Connectivity: " + x10.connectivity);
        System.out.println("Compatibility: " + x10.compatibility);

    }
}