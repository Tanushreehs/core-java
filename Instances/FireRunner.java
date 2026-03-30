class FireRunner {

    public static void main(String[] args) {

        Fire fire1 = new Fire();
        Fire fire2 = new Fire();
        Fire fire3 = new Fire();
        Fire fire4 = new Fire();
        Fire fire5 = new Fire();
        Fire fire6 = new Fire();
        Fire fire7 = new Fire();
        Fire fire8 = new Fire();
        Fire fire9 = new Fire();
        Fire fire10 = new Fire();

        fire1.temperature = 100;
        fire1.fuel = "Wood";
        fire1.isDangerous = true;
        fire1.intensity = "Low";
        fire1.duration = 2.5;
        fire1.smokeLevel = "Medium";
        fire1.oxygenLevel = 20;
        fire1.spreadSpeed = 5;
        fire1.location = "Forest";
        fire1.isControlled = false;

        fire2.temperature = 200;
        fire2.fuel = "Gas";
        fire2.isDangerous = true;
        fire2.intensity = "Medium";
        fire2.duration = 3.0;
        fire2.smokeLevel = "High";
        fire2.oxygenLevel = 18;
        fire2.spreadSpeed = 7;
        fire2.location = "Kitchen";
        fire2.isControlled = true;

        fire3.temperature = 300;
        fire3.fuel = "Coal";
        fire3.isDangerous = true;
        fire3.intensity = "High";
        fire3.duration = 4.5;
        fire3.smokeLevel = "High";
        fire3.oxygenLevel = 17;
        fire3.spreadSpeed = 8;
        fire3.location = "Factory";
        fire3.isControlled = false;

        fire4.temperature = 400;
        fire4.fuel = "Oil";
        fire4.isDangerous = true;
        fire4.intensity = "Very High";
        fire4.duration = 5.0;
        fire4.smokeLevel = "Very High";
        fire4.oxygenLevel = 16;
        fire4.spreadSpeed = 9;
        fire4.location = "Warehouse";
        fire4.isControlled = false;

        fire5.temperature = 500;
        fire5.fuel = "Plastic";
        fire5.isDangerous = true;
        fire5.intensity = "Extreme";
        fire5.duration = 6.0;
        fire5.smokeLevel = "Toxic";
        fire5.oxygenLevel = 15;
        fire5.spreadSpeed = 10;
        fire5.location = "Dump Yard";
        fire5.isControlled = false;

        fire6.temperature = 600;
        fire6.fuel = "Paper";
        fire6.isDangerous = false;
        fire6.intensity = "Low";
        fire6.duration = 1.5;
        fire6.smokeLevel = "Low";
        fire6.oxygenLevel = 21;
        fire6.spreadSpeed = 4;
        fire6.location = "Office";
        fire6.isControlled = true;

        fire7.temperature = 700;
        fire7.fuel = "Diesel";
        fire7.isDangerous = true;
        fire7.intensity = "High";
        fire7.duration = 5.5;
        fire7.smokeLevel = "High";
        fire7.oxygenLevel = 16;
        fire7.spreadSpeed = 9;
        fire7.location = "Garage";
        fire7.isControlled = false;

        fire8.temperature = 800;
        fire8.fuel = "Petrol";
        fire8.isDangerous = true;
        fire8.intensity = "Extreme";
        fire8.duration = 6.5;
        fire8.smokeLevel = "Very High";
        fire8.oxygenLevel = 14;
        fire8.spreadSpeed = 11;
        fire8.location = "Fuel Station";
        fire8.isControlled = false;

        fire9.temperature = 900;
        fire9.fuel = "Charcoal";
        fire9.isDangerous = true;
        fire9.intensity = "Medium";
        fire9.duration = 3.5;
        fire9.smokeLevel = "Medium";
        fire9.oxygenLevel = 18;
        fire9.spreadSpeed = 6;
        fire9.location = "Backyard";
        fire9.isControlled = true;

        fire10.temperature = 1000;
        fire10.fuel = "Gas";
        fire10.isDangerous = true;
        fire10.intensity = "Extreme";
        fire10.duration = 7.0;
        fire10.smokeLevel = "Very High";
        fire10.oxygenLevel = 13;
        fire10.spreadSpeed = 12;
        fire10.location = "Industry";
        fire10.isControlled = false;


        System.out.println("\nFire1 Details");
        System.out.println("Color: " + fire1.color);
        System.out.println("Type: " + fire1.type);
        System.out.println("Base Temp: " + fire1.baseTemperature);
        System.out.println("Origin: " + fire1.origin);
        System.out.println("Needs Oxygen: " + fire1.needsOxygen);
        System.out.println("Temperature: " + fire1.temperature);
        System.out.println("Fuel: " + fire1.fuel);
        System.out.println("Dangerous: " + fire1.isDangerous);
        System.out.println("Intensity: " + fire1.intensity);
        System.out.println("Duration: " + fire1.duration);
        System.out.println("Smoke: " + fire1.smokeLevel);
        System.out.println("Oxygen Level: " + fire1.oxygenLevel);
        System.out.println("Spread Speed: " + fire1.spreadSpeed);
        System.out.println("Location: " + fire1.location);
        System.out.println("Controlled: " + fire1.isControlled);

        System.out.println("\nFire2 Details");
        System.out.println("Color: " + fire2.color);
        System.out.println("Type: " + fire2.type);
        System.out.println("Base Temp: " + fire2.baseTemperature);
        System.out.println("Origin: " + fire2.origin);
        System.out.println("Needs Oxygen: " + fire2.needsOxygen);
        System.out.println("Temperature: " + fire2.temperature);
        System.out.println("Fuel: " + fire2.fuel);
        System.out.println("Dangerous: " + fire2.isDangerous);
        System.out.println("Intensity: " + fire2.intensity);
        System.out.println("Duration: " + fire2.duration);
        System.out.println("Smoke: " + fire2.smokeLevel);
        System.out.println("Oxygen Level: " + fire2.oxygenLevel);
        System.out.println("Spread Speed: " + fire2.spreadSpeed);
        System.out.println("Location: " + fire2.location);
        System.out.println("Controlled: " + fire2.isControlled);
		
		        System.out.println("\nFire3 Details");
        System.out.println("Color: " + fire3.color);
        System.out.println("Type: " + fire3.type);
        System.out.println("Base Temp: " + fire3.baseTemperature);
        System.out.println("Origin: " + fire3.origin);
        System.out.println("Needs Oxygen: " + fire3.needsOxygen);
        System.out.println("Temperature: " + fire3.temperature);
        System.out.println("Fuel: " + fire3.fuel);
        System.out.println("Dangerous: " + fire3.isDangerous);
        System.out.println("Intensity: " + fire3.intensity);
        System.out.println("Duration: " + fire3.duration);
        System.out.println("Smoke: " + fire3.smokeLevel);
        System.out.println("Oxygen Level: " + fire3.oxygenLevel);
        System.out.println("Spread Speed: " + fire3.spreadSpeed);
        System.out.println("Location: " + fire3.location);
        System.out.println("Controlled: " + fire3.isControlled);

        System.out.println("\nFire4 Details");
        System.out.println("Color: " + fire4.color);
        System.out.println("Type: " + fire4.type);
        System.out.println("Base Temp: " + fire4.baseTemperature);
        System.out.println("Origin: " + fire4.origin);
        System.out.println("Needs Oxygen: " + fire4.needsOxygen);
        System.out.println("Temperature: " + fire4.temperature);
        System.out.println("Fuel: " + fire4.fuel);
        System.out.println("Dangerous: " + fire4.isDangerous);
        System.out.println("Intensity: " + fire4.intensity);
        System.out.println("Duration: " + fire4.duration);
        System.out.println("Smoke: " + fire4.smokeLevel);
        System.out.println("Oxygen Level: " + fire4.oxygenLevel);
        System.out.println("Spread Speed: " + fire4.spreadSpeed);
        System.out.println("Location: " + fire4.location);
        System.out.println("Controlled: " + fire4.isControlled);

        System.out.println("\nFire5 Details");
        System.out.println("Color: " + fire5.color);
        System.out.println("Type: " + fire5.type);
        System.out.println("Base Temp: " + fire5.baseTemperature);
        System.out.println("Origin: " + fire5.origin);
        System.out.println("Needs Oxygen: " + fire5.needsOxygen);
        System.out.println("Temperature: " + fire5.temperature);
        System.out.println("Fuel: " + fire5.fuel);
        System.out.println("Dangerous: " + fire5.isDangerous);
        System.out.println("Intensity: " + fire5.intensity);
        System.out.println("Duration: " + fire5.duration);
        System.out.println("Smoke: " + fire5.smokeLevel);
        System.out.println("Oxygen Level: " + fire5.oxygenLevel);
        System.out.println("Spread Speed: " + fire5.spreadSpeed);
        System.out.println("Location: " + fire5.location);
        System.out.println("Controlled: " + fire5.isControlled);

        System.out.println("\nFire6 Details");
        System.out.println("Color: " + fire6.color);
        System.out.println("Type: " + fire6.type);
        System.out.println("Base Temp: " + fire6.baseTemperature);
        System.out.println("Origin: " + fire6.origin);
        System.out.println("Needs Oxygen: " + fire6.needsOxygen);
        System.out.println("Temperature: " + fire6.temperature);
        System.out.println("Fuel: " + fire6.fuel);
        System.out.println("Dangerous: " + fire6.isDangerous);
        System.out.println("Intensity: " + fire6.intensity);
        System.out.println("Duration: " + fire6.duration);
        System.out.println("Smoke: " + fire6.smokeLevel);
        System.out.println("Oxygen Level: " + fire6.oxygenLevel);
        System.out.println("Spread Speed: " + fire6.spreadSpeed);
        System.out.println("Location: " + fire6.location);
        System.out.println("Controlled: " + fire6.isControlled);

        System.out.println("\nFire7 Details");
        System.out.println("Color: " + fire7.color);
        System.out.println("Type: " + fire7.type);
        System.out.println("Base Temp: " + fire7.baseTemperature);
        System.out.println("Origin: " + fire7.origin);
        System.out.println("Needs Oxygen: " + fire7.needsOxygen);
        System.out.println("Temperature: " + fire7.temperature);
        System.out.println("Fuel: " + fire7.fuel);
        System.out.println("Dangerous: " + fire7.isDangerous);
        System.out.println("Intensity: " + fire7.intensity);
        System.out.println("Duration: " + fire7.duration);
        System.out.println("Smoke: " + fire7.smokeLevel);
        System.out.println("Oxygen Level: " + fire7.oxygenLevel);
        System.out.println("Spread Speed: " + fire7.spreadSpeed);
        System.out.println("Location: " + fire7.location);
        System.out.println("Controlled: " + fire7.isControlled);

        System.out.println("\nFire8 Details");
        System.out.println("Color: " + fire8.color);
        System.out.println("Type: " + fire8.type);
        System.out.println("Base Temp: " + fire8.baseTemperature);
        System.out.println("Origin: " + fire8.origin);
        System.out.println("Needs Oxygen: " + fire8.needsOxygen);
        System.out.println("Temperature: " + fire8.temperature);
        System.out.println("Fuel: " + fire8.fuel);
        System.out.println("Dangerous: " + fire8.isDangerous);
        System.out.println("Intensity: " + fire8.intensity);
        System.out.println("Duration: " + fire8.duration);
        System.out.println("Smoke: " + fire8.smokeLevel);
        System.out.println("Oxygen Level: " + fire8.oxygenLevel);
        System.out.println("Spread Speed: " + fire8.spreadSpeed);
        System.out.println("Location: " + fire8.location);
        System.out.println("Controlled: " + fire8.isControlled);

        System.out.println("\nFire9 Details");
        System.out.println("Color: " + fire9.color);
        System.out.println("Type: " + fire9.type);
        System.out.println("Base Temp: " + fire9.baseTemperature);
        System.out.println("Origin: " + fire9.origin);
        System.out.println("Needs Oxygen: " + fire9.needsOxygen);
        System.out.println("Temperature: " + fire9.temperature);
        System.out.println("Fuel: " + fire9.fuel);
        System.out.println("Dangerous: " + fire9.isDangerous);
        System.out.println("Intensity: " + fire9.intensity);
        System.out.println("Duration: " + fire9.duration);
        System.out.println("Smoke: " + fire9.smokeLevel);
        System.out.println("Oxygen Level: " + fire9.oxygenLevel);
        System.out.println("Spread Speed: " + fire9.spreadSpeed);
        System.out.println("Location: " + fire9.location);
        System.out.println("Controlled: " + fire9.isControlled);

        System.out.println("\nFire10 Details");
        System.out.println("Color: " + fire10.color);
        System.out.println("Type: " + fire10.type);
        System.out.println("Base Temp: " + fire10.baseTemperature);
        System.out.println("Origin: " + fire10.origin);
        System.out.println("Needs Oxygen: " + fire10.needsOxygen);
        System.out.println("Temperature: " + fire10.temperature);
        System.out.println("Fuel: " + fire10.fuel);
        System.out.println("Dangerous: " + fire10.isDangerous);
        System.out.println("Intensity: " + fire10.intensity);
        System.out.println("Duration: " + fire10.duration);
        System.out.println("Smoke: " + fire10.smokeLevel);
        System.out.println("Oxygen Level: " + fire10.oxygenLevel);
        System.out.println("Spread Speed: " + fire10.spreadSpeed);
        System.out.println("Location: " + fire10.location);
        System.out.println("Controlled: " + fire10.isControlled);

       
    }
}