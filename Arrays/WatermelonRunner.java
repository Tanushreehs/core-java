class WatermelonRunner{
	public static void main(String[] args){
		WatermelonStore watermelonStore=new WatermelonStore();
		Watermelon watermelon1 = new Watermelon("Green", 5.5, "Round", true, "Sweet", 200, 30.0, "India", true, 25.5);
		watermelonStore.store(watermelon1);
		Watermelon watermelon2 = new Watermelon("Dark Green", 6.2, "Oval", false, "Very Sweet", 150, 28.0, "China", true, 27.0);
		watermelonStore.store(watermelon2);
		Watermelon watermelon3 = new Watermelon("Light Green", 4.8, "Round", true, "Sweet", 180, 32.0, "Mexico", true, 24.5);
		watermelonStore.store(watermelon3);
		Watermelon watermelon4 = new Watermelon("Green Striped", 7.0, "Oval", false, "Juicy", 220, 26.0, "Pakistan", true, 29.0);
		watermelonStore.store(watermelon4);
		Watermelon watermelon5 = new Watermelon("Green", 5.0, "Round", true, "Sweet", 170, 30.0, "Qatar", true, 25.0);
		watermelonStore.store(watermelon5);
		Watermelon watermelon6 = new Watermelon("Dark Green", 6.5, "Oval", false, "Very Sweet", 210, 27.5, "Dubai", true, 28.0);
		watermelonStore.store(watermelon6);
		Watermelon watermelon7 = new Watermelon("Light Green", 4.5, "Round", true, "Sweet", 160, 31.0, "Malasia", true, 23.5);
		watermelonStore.store(watermelon7);
		Watermelon watermelon8 = new Watermelon("Green Striped", 7.2, "Oval", false, "Juicy", 230, 26.5, "egypt", true, 30.0);
		watermelonStore.store(watermelon8);
		Watermelon watermelon9 = new Watermelon("Green", 5.8, "Round", true, "Sweet", 190, 29.0, "Nepal", true, 26.0);
		watermelonStore.store(watermelon9);
		Watermelon watermelon10 = new Watermelon("Dark Green", 6.8, "Oval", false, "Very Sweet", 205, 27.0, "Israel", true, 28.5);
		watermelonStore.store(watermelon10);
        Watermelon watermelon11 = new Watermelon("Light Green", 4.9, "Round", true, "Sweet", 175, 32.5, "New Zealand", true, 24.8);
		watermelonStore.store(watermelon11);
		Watermelon watermelon12 = new Watermelon("Green Striped", 7.5, "Oval", false, "Juicy", 240, 25.5, "Australia", true, 30.5);
		watermelonStore.store(watermelon12);
		Watermelon watermelon13 = new Watermelon("Green", 5.3, "Round", true, "Sweet", 165, 30.5, "Karnataka", true, 25.2);
		watermelonStore.store(watermelon13);
		Watermelon watermelon14 = new Watermelon("Dark Green", 6.1, "Oval", false, "Very Sweet", 198, 28.2, "Goa", true, 27.3);
		watermelonStore.store(watermelon14);
		Watermelon watermelon15 = new Watermelon("Light Green", 4.7, "Round", true, "Sweet", 172, 31.8, "Delhi", true, 24.0);
		watermelonStore.store(watermelon15);
		Watermelon watermelon16 = new Watermelon("Green Striped", 7.3, "Oval", false, "Juicy", 225, 26.8, "Hyderabad", true, 29.8);
		watermelonStore.store(watermelon16);
		Watermelon watermelon17 = new Watermelon("Green", 5.6, "Round", true, "Sweet", 185, 29.5, "Rajasthan", true, 26.3);
		watermelonStore.store(watermelon17);
		Watermelon watermelon18 = new Watermelon("Dark Green", 6.9, "Oval", false, "Very Sweet", 215, 27.8, "Mumbai", true, 28.7);
		watermelonStore.store(watermelon18);
		Watermelon watermelon19 = new Watermelon("Light Green", 4.6, "Round", true, "Sweet", 168, 31.2, "Kerala", true, 23.8);
		watermelonStore.store(watermelon19);
		Watermelon watermelon20 = new Watermelon("Green Striped", 7.6, "Oval", false, "Juicy", 245, 25.0, "Sikkim", true, 31.0);
		watermelonStore.store(watermelon20);
	    watermelonStore.display();
		Watermelon newWatermelon=new Watermelon("Yellow",7.2,"Oval",false,"Juicy",205,21.0,"Mysore",true,18.0);
		watermelonStore.update(watermelon7,newWatermelon);
		System.out.println("After Update:");
		watermelonStore.display();
			
		
		
		
				
				
			}
		}