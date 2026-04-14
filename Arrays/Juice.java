class Juice {
    String[] items = new String[5];
    int index = 0;

    void save(String item) {
        System.out.println("Saving Juice details:");
        if (item != null && index < items.length) {
            items[index++] = item;
            System.out.println("Juice: " + item);
        }
    }

    void search(String item) {
        boolean found = false;
        for (String temp : items) {
            if (item.equals(temp)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Juice found" : "Juice not found");
    }
}