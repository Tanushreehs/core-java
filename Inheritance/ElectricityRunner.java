class ElectricityRunner {
    public static void main(String[] args) {
        Power electricity1 = new Power(220, "AC");
        Power electricity2 = new Power(110, "DC");
        System.out.println("Electricity 1: Voltage=" + electricity1.voltage + ", Type=" + electricity1.type);
        System.out.println("Electricity 2: Voltage=" + electricity2.voltage + ", Type=" + electricity2.type);
    }
}