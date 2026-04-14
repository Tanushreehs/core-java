class Aeroplane {
    String[] items = new String[5];
    int index = 0;

    void save(String item) {
        if (item != null && index < items.length) {
            items[index++] = item;
            System.out.println("Aeroplane: " + item);
        }
    }

    void search(String item) {
        for (String temp : items) {
            if (item.equals(temp)) {
                System.out.println("Aeroplane found");
                return;
            }
        }
        System.out.println("Aeroplane not found");
    }
}