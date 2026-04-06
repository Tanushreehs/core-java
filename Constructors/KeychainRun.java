class KeychainRun {

    KeychainRun() {
        System.out.println("No-arg constructor");
    }

    void useKeychain(Keychain keychain) {
        if (keychain != null) {
            keychain.display();
        } else {
            System.out.println("Keychain is null");
        }
    }
}