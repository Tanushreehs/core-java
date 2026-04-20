class Power extends Electricity {
    Power(int voltage, String type) {
        super(voltage, type);
        System.out.println("Power Constructor");
    }
}