class TechRoom {

    String roomName;       
    int systemCount;       

    Monitor monitor;       
    ScreenType type;      

    TechRoom(String roomName, int systemCount) {
        this.roomName = roomName;
        this.systemCount = systemCount;
    }

    void details() {

        System.out.println("Room Name: " + this.roomName);
        System.out.println("System Count: " + this.systemCount);
        System.out.println("Screen Type: " + this.type);

        if(monitor != null) {
            monitor.show();
        } else {
            System.out.println("Monitor is null");
        }
    }
}