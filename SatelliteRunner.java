class SatelliteRunner {

    public static void main(String[] args) {

        Satellite s1 = new Satellite();
        Satellite s2 = new Satellite();
        Satellite s3 = new Satellite();
        Satellite s4 = new Satellite();
        Satellite s5 = new Satellite();
        Satellite s6 = new Satellite();
        Satellite s7 = new Satellite();
        Satellite s8 = new Satellite();
        Satellite s9 = new Satellite();
        Satellite s10 = new Satellite();

        s1.weight = 2000;
        s1.orbitType = "GEO";
        s1.altitude = 36000;
        s1.manufacturer = "ISRO";
        s1.isReusable = false;
        s1.lifespan = 15;
        s1.launchVehicle = "GSLV";
        s1.purpose = "Communication";
        s1.frequencyBand = "Ku";

        s2.weight = 1800;
        s2.orbitType = "LEO";
        s2.altitude = 500;
        s2.manufacturer = "NASA";
        s2.isReusable = false;
        s2.lifespan = 10;
        s2.launchVehicle = "Falcon 9";
        s2.purpose = "Research";
        s2.frequencyBand = "S";

        s3.weight = 2200;
        s3.orbitType = "MEO";
        s3.altitude = 20000;
        s3.manufacturer = "ESA";
        s3.isReusable = false;
        s3.lifespan = 12;
        s3.launchVehicle = "Ariane 5";
        s3.purpose = "Navigation";
        s3.frequencyBand = "L";

        s4.weight = 2500;
        s4.orbitType = "GEO";
        s4.altitude = 36000;
        s4.manufacturer = "ISRO";
        s4.isReusable = false;
        s4.lifespan = 14;
        s4.launchVehicle = "GSLV Mk3";
        s4.purpose = "Weather";
        s4.frequencyBand = "C";

        s5.weight = 1700;
        s5.orbitType = "LEO";
        s5.altitude = 600;
        s5.manufacturer = "SpaceX";
        s5.isReusable = true;
        s5.lifespan = 8;
        s5.launchVehicle = "Falcon 9";
        s5.purpose = "Internet";
        s5.frequencyBand = "Ka";

        s6.weight = 2100;
        s6.orbitType = "MEO";
        s6.altitude = 21000;
        s6.manufacturer = "NASA";
        s6.isReusable = false;
        s6.lifespan = 11;
        s6.launchVehicle = "Atlas V";
        s6.purpose = "Research";
        s6.frequencyBand = "S";

        s7.weight = 2600;
        s7.orbitType = "GEO";
        s7.altitude = 36000;
        s7.manufacturer = "ISRO";
        s7.isReusable = false;
        s7.lifespan = 15;
        s7.launchVehicle = "GSLV";
        s7.purpose = "Communication";
        s7.frequencyBand = "Ku";

        s8.weight = 1900;
        s8.orbitType = "LEO";
        s8.altitude = 700;
        s8.manufacturer = "ESA";
        s8.isReusable = false;
        s8.lifespan = 9;
        s8.launchVehicle = "Vega";
        s8.purpose = "Earth Observation";
        s8.frequencyBand = "X";

        s9.weight = 2300;
        s9.orbitType = "MEO";
        s9.altitude = 22000;
        s9.manufacturer = "NASA";
        s9.isReusable = false;
        s9.lifespan = 13;
        s9.launchVehicle = "Delta IV";
        s9.purpose = "Navigation";
        s9.frequencyBand = "L";

        s10.weight = 2700;
        s10.orbitType = "GEO";
        s10.altitude = 36000;
        s10.manufacturer = "ISRO";
        s10.isReusable = false;
        s10.lifespan = 16;
        s10.launchVehicle = "GSLV Mk3";
        s10.purpose = "Communication";
        s10.frequencyBand = "Ka";


        System.out.println("\nSatellite1 Details");
        System.out.println("Name: " + s1.name);
        System.out.println("Country: " + s1.country);
        System.out.println("Type: " + s1.type);
        System.out.println("Active: " + s1.isActive);
        System.out.println("Launch Year: " + s1.launchYear);
        System.out.println("Weight: " + s1.weight);
        System.out.println("Orbit: " + s1.orbitType);
        System.out.println("Altitude: " + s1.altitude);
        System.out.println("Manufacturer: " + s1.manufacturer);
        System.out.println("Reusable: " + s1.isReusable);
        System.out.println("Lifespan: " + s1.lifespan);
        System.out.println("Launch Vehicle: " + s1.launchVehicle);
        System.out.println("Purpose: " + s1.purpose);
        System.out.println("Frequency Band: " + s1.frequencyBand);

        System.out.println("\nSatellite2 Details");
        System.out.println("Name: " + s2.name);
        System.out.println("Country: " + s2.country);
        System.out.println("Type: " + s2.type);
        System.out.println("Active: " + s2.isActive);
        System.out.println("Launch Year: " + s2.launchYear);
        System.out.println("Weight: " + s2.weight);
        System.out.println("Orbit: " + s2.orbitType);
        System.out.println("Altitude: " + s2.altitude);
        System.out.println("Manufacturer: " + s2.manufacturer);
        System.out.println("Reusable: " + s2.isReusable);
        System.out.println("Lifespan: " + s2.lifespan);
        System.out.println("Launch Vehicle: " + s2.launchVehicle);
        System.out.println("Purpose: " + s2.purpose);
        System.out.println("Frequency Band: " + s2.frequencyBand);
		
		        System.out.println("\nSatellite3 Details");
        System.out.println("Name: " + s3.name);
        System.out.println("Country: " + s3.country);
        System.out.println("Type: " + s3.type);
        System.out.println("Active: " + s3.isActive);
        System.out.println("Launch Year: " + s3.launchYear);
        System.out.println("Weight: " + s3.weight);
        System.out.println("Orbit: " + s3.orbitType);
        System.out.println("Altitude: " + s3.altitude);
        System.out.println("Manufacturer: " + s3.manufacturer);
        System.out.println("Reusable: " + s3.isReusable);
        System.out.println("Lifespan: " + s3.lifespan);
        System.out.println("Launch Vehicle: " + s3.launchVehicle);
        System.out.println("Purpose: " + s3.purpose);
        System.out.println("Frequency Band: " + s3.frequencyBand);

        System.out.println("\nSatellite4 Details");
        System.out.println("Name: " + s4.name);
        System.out.println("Country: " + s4.country);
        System.out.println("Type: " + s4.type);
        System.out.println("Active: " + s4.isActive);
        System.out.println("Launch Year: " + s4.launchYear);
        System.out.println("Weight: " + s4.weight);
        System.out.println("Orbit: " + s4.orbitType);
        System.out.println("Altitude: " + s4.altitude);
        System.out.println("Manufacturer: " + s4.manufacturer);
        System.out.println("Reusable: " + s4.isReusable);
        System.out.println("Lifespan: " + s4.lifespan);
        System.out.println("Launch Vehicle: " + s4.launchVehicle);
        System.out.println("Purpose: " + s4.purpose);
        System.out.println("Frequency Band: " + s4.frequencyBand);

        System.out.println("\nSatellite5 Details");
        System.out.println("Name: " + s5.name);
        System.out.println("Country: " + s5.country);
        System.out.println("Type: " + s5.type);
        System.out.println("Active: " + s5.isActive);
        System.out.println("Launch Year: " + s5.launchYear);
        System.out.println("Weight: " + s5.weight);
        System.out.println("Orbit: " + s5.orbitType);
        System.out.println("Altitude: " + s5.altitude);
        System.out.println("Manufacturer: " + s5.manufacturer);
        System.out.println("Reusable: " + s5.isReusable);
        System.out.println("Lifespan: " + s5.lifespan);
        System.out.println("Launch Vehicle: " + s5.launchVehicle);
        System.out.println("Purpose: " + s5.purpose);
        System.out.println("Frequency Band: " + s5.frequencyBand);

        System.out.println("\nSatellite6 Details");
        System.out.println("Name: " + s6.name);
        System.out.println("Country: " + s6.country);
        System.out.println("Type: " + s6.type);
        System.out.println("Active: " + s6.isActive);
        System.out.println("Launch Year: " + s6.launchYear);
        System.out.println("Weight: " + s6.weight);
        System.out.println("Orbit: " + s6.orbitType);
        System.out.println("Altitude: " + s6.altitude);
        System.out.println("Manufacturer: " + s6.manufacturer);
        System.out.println("Reusable: " + s6.isReusable);
        System.out.println("Lifespan: " + s6.lifespan);
        System.out.println("Launch Vehicle: " + s6.launchVehicle);
        System.out.println("Purpose: " + s6.purpose);
        System.out.println("Frequency Band: " + s6.frequencyBand);

        System.out.println("\nSatellite7 Details");
        System.out.println("Name: " + s7.name);
        System.out.println("Country: " + s7.country);
        System.out.println("Type: " + s7.type);
        System.out.println("Active: " + s7.isActive);
        System.out.println("Launch Year: " + s7.launchYear);
        System.out.println("Weight: " + s7.weight);
        System.out.println("Orbit: " + s7.orbitType);
        System.out.println("Altitude: " + s7.altitude);
        System.out.println("Manufacturer: " + s7.manufacturer);
        System.out.println("Reusable: " + s7.isReusable);
        System.out.println("Lifespan: " + s7.lifespan);
        System.out.println("Launch Vehicle: " + s7.launchVehicle);
        System.out.println("Purpose: " + s7.purpose);
        System.out.println("Frequency Band: " + s7.frequencyBand);

        System.out.println("\nSatellite8 Details");
        System.out.println("Name: " + s8.name);
        System.out.println("Country: " + s8.country);
        System.out.println("Type: " + s8.type);
        System.out.println("Active: " + s8.isActive);
        System.out.println("Launch Year: " + s8.launchYear);
        System.out.println("Weight: " + s8.weight);
        System.out.println("Orbit: " + s8.orbitType);
        System.out.println("Altitude: " + s8.altitude);
        System.out.println("Manufacturer: " + s8.manufacturer);
        System.out.println("Reusable: " + s8.isReusable);
        System.out.println("Lifespan: " + s8.lifespan);
        System.out.println("Launch Vehicle: " + s8.launchVehicle);
        System.out.println("Purpose: " + s8.purpose);
        System.out.println("Frequency Band: " + s8.frequencyBand);

        System.out.println("\nSatellite9 Details");
        System.out.println("Name: " + s9.name);
        System.out.println("Country: " + s9.country);
        System.out.println("Type: " + s9.type);
        System.out.println("Active: " + s9.isActive);
        System.out.println("Launch Year: " + s9.launchYear);
        System.out.println("Weight: " + s9.weight);
        System.out.println("Orbit: " + s9.orbitType);
        System.out.println("Altitude: " + s9.altitude);
        System.out.println("Manufacturer: " + s9.manufacturer);
        System.out.println("Reusable: " + s9.isReusable);
        System.out.println("Lifespan: " + s9.lifespan);
        System.out.println("Launch Vehicle: " + s9.launchVehicle);
        System.out.println("Purpose: " + s9.purpose);
        System.out.println("Frequency Band: " + s9.frequencyBand);

        System.out.println("\nSatellite10 Details");
        System.out.println("Name: " + s10.name);
        System.out.println("Country: " + s10.country);
        System.out.println("Type: " + s10.type);
        System.out.println("Active: " + s10.isActive);
        System.out.println("Launch Year: " + s10.launchYear);
        System.out.println("Weight: " + s10.weight);
        System.out.println("Orbit: " + s10.orbitType);
        System.out.println("Altitude: " + s10.altitude);
        System.out.println("Manufacturer: " + s10.manufacturer);
        System.out.println("Reusable: " + s10.isReusable);
        System.out.println("Lifespan: " + s10.lifespan);
        System.out.println("Launch Vehicle: " + s10.launchVehicle);
        System.out.println("Purpose: " + s10.purpose);
        System.out.println("Frequency Band: " + s10.frequencyBand);

      
    }
}