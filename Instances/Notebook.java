class Notebook {
    String brand;
    String color;
    int numberOfPages;
    String pageType;
    String size;
    double price;
    String bindingType;
    String coverType;
    boolean isHardCover;
    String paperQuality;
    String rulingType;
    String orientation;
    String subject;
    String manufacturer;
    double weight;
    String dimensions;
    boolean isSpiral;
    String design;
    String usageType;
    String countryOfOrigin;
    int warrantyPeriod;
    String texture;
    boolean isEcoFriendly;
    String inkCompatibility;
    String packaging;
    String availability;
	
	Notebook(){
		System.out.println("No-arg constructor");
		brand = "Classmate";
        color = "Blue";
        numberOfPages = 200;
        pageType = "Ruled";
        size = "A4";
        price = 120.50;
        bindingType = "Spiral";
        coverType = "Hard Cover";
        isHardCover = true;
        paperQuality = "Premium";
        rulingType = "Single Line";
        orientation = "Portrait";
        subject = "Mathematics";
        manufacturer = "ITC Limited";
        weight = 0.5;
        dimensions = "21 x 29.7 cm";
        isSpiral = true;
        design = "Floral Print";
        usageType = "School";
        countryOfOrigin = "India";
        warrantyPeriod = 6;
        texture = "Smooth";
        isEcoFriendly = true;
        inkCompatibility = "Gel Pen";
        packaging = "Plastic Wrap";
        availability = "In Stock";
	}

}