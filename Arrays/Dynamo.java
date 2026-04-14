class Dynamo {
    String[] items = new String[5];
    int index = 0;

    void save(String item) {
        System.out.println("Saving Dynamo details:");
        if (item != null) {
            if (this.index < this.items.length) {
                this.items[this.index] = item;
                System.out.println("Dynamo name: " + item);
                System.out.println("Stored at index: " + this.index);
                index++;
            } else {
                System.out.println("Array full");
            }
        } else {
            System.out.println("Null value not allowed");
        }
    }

    void search(String item) {
        if (item != null) {
            boolean found = false;
            for (String temp : this.items) {
                if (item.equals(temp)) {
                    System.out.println("Dynamo found");
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Dynamo not found");
        }
    }
}