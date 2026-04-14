class BiometricRunner {
    public static void main(String[] args) {
        Biometric biometric = new Biometric();

        biometric.save("Fingerprint");
        biometric.save("FaceScan");
        biometric.save("Iris");
        biometric.save("Voice");
        biometric.save("Palm");

        biometric.search("FaceScan");
    }
}