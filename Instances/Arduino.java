class Arduino {

    String boardName;
    String microcontroller;
    double operatingVoltage;
    double inputVoltage;
    int digitalPins;
    int analogPins;
    int pwmPins;
    int flashMemory;
    int sram;
    int eeprom;
    double clockSpeed;
    String usbType;
    String connectivity;
    boolean isWifiEnabled;
    boolean isBluetoothEnabled;
    String powerSource;
    String programmingLanguage;
    String ide;
    String manufacturer;
    String countryOfOrigin;
    double price;
    String dimensions;
    double weight;
    String usage;
    String packaging;
    String condition;

    Arduino() {
        boardName = "Arduino Uno";
        microcontroller = "ATmega328P";
        operatingVoltage = 5.0;
        inputVoltage = 12.0;
        digitalPins = 14;
        analogPins = 6;
        pwmPins = 6;
        flashMemory = 32;
        sram = 2;
        eeprom = 1;
        clockSpeed = 16.0;
        usbType = "USB Type-B";
        connectivity = "USB";
        isWifiEnabled = false;
        isBluetoothEnabled = false;
        powerSource = "External Adapter";
        programmingLanguage = "C/C++";
        ide = "Arduino IDE";
        manufacturer = "Arduino";
        countryOfOrigin = "Italy";
        price = 799.00;
        dimensions = "68.6 x 53.4 mm";
        weight = 25.0;
        usage = "Embedded Projects";
        packaging = "Box";
        condition = "New";
    }
}

