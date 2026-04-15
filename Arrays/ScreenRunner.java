class ScreenRunner{
	public static void main(String[] args){

		ScreenStore screenStore = new ScreenStore();
        Screen screen1 = new Screen("Samsung", 55.0, "4K", "LED", 60, 45000.0, "Black", "HDMI", true, "2 Years");
		Screen screen2 = new Screen("LG", 65.0, "4K", "OLED", 120, 85000.0, "Black", "HDMI", true, "3 Years");
		Screen screen3 = new Screen("Sony", 50.0, "Full HD", "LED", 60, 40000.0, "Black", "USB", true, "2 Years");
		Screen screen4 = new Screen("OnePlus", 43.0, "4K", "LED", 60, 30000.0, "Grey", "HDMI", true, "1 Year");
		Screen screen5 = new Screen("MI", 40.0, "Full HD", "LED", 60, 25000.0, "Black", "USB", true, "1 Year");
		Screen screen6 = new Screen("Panasonic", 49.0, "4K", "LED", 60, 42000.0, "Black", "HDMI", true, "2 Years");
		Screen screen7 = new Screen("TCL", 55.0, "4K", "QLED", 120, 50000.0, "Black", "HDMI", true, "3 Years");
		Screen screen8 = new Screen("Realme", 43.0, "Full HD", "LED", 60, 28000.0, "Black", "USB", true, "1 Year");
		Screen screen9 = new Screen("Philips", 58.0, "4K", "LED", 60, 47000.0, "Silver", "HDMI", true, "2 Years");
		Screen screen10 = new Screen("Vu", 50.0, "4K", "LED", 60, 38000.0, "Black", "HDMI", true, "1 Year");
        Screen screen11 = new Screen("Samsung", 75.0, "8K", "QLED", 120, 150000.0, "Black", "HDMI", true, "3 Years");
		Screen screen12 = new Screen("LG", 48.0, "4K", "OLED", 120, 70000.0, "Black", "HDMI", true, "3 Years");
		Screen screen13 = new Screen("Sony", 65.0, "4K", "LED", 60, 90000.0, "Black", "USB", true, "2 Years");
		Screen screen14 = new Screen("MI", 32.0, "HD", "LED", 60, 15000.0, "Black", "USB", false, "1 Year");
		Screen screen15 = new Screen("OnePlus", 55.0, "4K", "QLED", 120, 60000.0, "Grey", "HDMI", true, "2 Years");
		Screen screen16 = new Screen("Panasonic", 43.0, "Full HD", "LED", 60, 27000.0, "Black", "USB", false, "1 Year");
		Screen screen17 = new Screen("TCL", 65.0, "4K", "QLED", 120, 75000.0, "Black", "HDMI", true, "3 Years");
		Screen screen18 = new Screen("Realme", 50.0, "4K", "LED", 60, 35000.0, "Black", "USB", true, "1 Year");
		Screen screen19 = new Screen("Philips", 55.0, "4K", "LED", 60, 48000.0, "Silver", "HDMI", true, "2 Years");
		Screen screen20 = new Screen("Vu", 43.0, "Full HD", "LED", 60, 26000.0, "Black", "USB", false, "1 Year");
        screenStore.store(screen1);
		screenStore.store(screen2);
		screenStore.store(screen3);
		screenStore.store(screen4);
		screenStore.store(screen5);
		screenStore.store(screen6);
		screenStore.store(screen7);
		screenStore.store(screen8);
		screenStore.store(screen9);
		screenStore.store(screen10);
		screenStore.store(screen11);
		screenStore.store(screen12);
		screenStore.store(screen13);
		screenStore.store(screen14);
		screenStore.store(screen15);
		screenStore.store(screen16);
		screenStore.store(screen17);
		screenStore.store(screen18);
		screenStore.store(screen19);
		screenStore.store(screen20);
        screenStore.display();
        Screen newScreen = new Screen("Apple", 60.0, "5K", "Retina", 120, 200000.0, "Silver", "HDMI", true, "3 Years");
        screenStore.update(screen5, newScreen);
        System.out.println("After Update:");
		screenStore.display();
	}
}