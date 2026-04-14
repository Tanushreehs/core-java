class Biometric {
    String[] items = new String[5];
    int index = 0;

    void save(String item) {
        System.out.println("Saving Biometric details:");
        if (item != null) {
            if (index < items.length) {
                items[index] = item;
                System.out.println("Biometric: " + item);
                index++;
            }
        }
    }

    void search(String item) {
        for (String temp : items) {
            if (item.equals(temp)) {
                System.out.println("Biometric found");
                return;
            }
        }
        System.out.println("Biometric not found");
    }
}