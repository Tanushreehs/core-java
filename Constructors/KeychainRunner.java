public class KeychainRunner {
    public static void main(String[] args) {

        Keychain keychain1 = new Keychain();
        KeychainRun keychainrun = new KeychainRun();
        keychainrun.useKeychain(keychain1);

        Keychain keychain2 = null;
        keychainrun.useKeychain(keychain2);
    }
}