class NewsPaperRunner {
     public static void main(String[] args) {
        NewsPaperStore newsPaperStore = new NewsPaperStore();
        NewsPaper newspaper1 = new NewsPaper(Lang.ENGLISH, "Premium", 5.2, 24, "GlobalTimes", 31.0, 210, "HeadA", "FootA", 13, 6, "Arjun", "Bangalore", InkColor.BLACK, 11);
        NewsPaper newspaper2 = new NewsPaper(Lang.KANNADA, "Standard", 4.1, 18, "Udaya", 29.0, 175, "HeadB", "FootB", 11, 4, "Tanu", "Mysore", InkColor.BLUE, 9);
        NewsPaper newspaper3 = new NewsPaper(Lang.HINDI, "Basic", 3.5, 14, "Navbharat", 27.5, 155, "HeadC", "FootC", 10, 3, "Thushar", "Delhi", InkColor.RED, 7);
        NewsPaper newspaper4 = new NewsPaper(Lang.ENGLISH, "Premium", 6.0, 28, "MorningStar", 32.0, 220, "HeadD", "FootD", 14, 7, "Viroksha", "Mumbai", InkColor.BLACK, 13);
        NewsPaper newspaper5 = new NewsPaper(Lang.TAMIL, "Standard", 4.6, 20, "TamilNews", 30.0, 180, "HeadE", "FootE", 12, 5, "Vinya", "Chennai", InkColor.BLUE, 10);
        NewsPaper newspaper6 = new NewsPaper(Lang.TELUGU, "Basic", 3.8, 16, "TeluguTimes", 28.5, 165, "HeadF", "FootF", 10, 4, "Sandeepa", "Hyderabad", InkColor.RED, 8);
        NewsPaper newspaper7 = new NewsPaper(Lang.KANNADA, "Premium", 5.7, 23, "Janapriya", 31.5, 205, "HeadG", "FootG", 13, 6, "Prakashini", "Bangalore", InkColor.BLACK, 12);
        NewsPaper newspaper8 = new NewsPaper(Lang.ENGLISH, "Standard", 4.3, 17, "CityNews", 28.0, 160, "HeadH", "FootH", 11, 4, "Naveenya", "Pune", InkColor.BLUE, 9);
        NewsPaper newspaper9 = new NewsPaper(Lang.HINDI, "Basic", 3.9, 15, "DailyVoice", 27.0, 150, "HeadI", "FootI", 10, 3, "Akhila", "Lucknow", InkColor.RED, 7);
        NewsPaper newspaper10 = new NewsPaper(Lang.ENGLISH, "Premium", 6.5, 30, "NationalExpress", 33.0, 230, "HeadJ", "FootJ", 15, 8, "Rohini", "Delhi", InkColor.BLACK, 14);
        newsPaperStore.save(newspaper1);
        newsPaperStore.save(newspaper2);
        newsPaperStore.save(newspaper3);
        newsPaperStore.save(newspaper4);
        newsPaperStore.save(newspaper5);
        newsPaperStore.save(newspaper6);
        newsPaperStore.save(newspaper7);
        newsPaperStore.save(newspaper8);
        newsPaperStore.save(newspaper9);
        newsPaperStore.save(newspaper10);
        String result1 = newsPaperStore.findPaperQualityByName("GlobalTimes");
        System.out.println(result1);
        int result2 = newsPaperStore.findNoOfPagesByNameAndHeadEditor("Tanu", "Anu");
        System.out.println(result2);
        newsPaperStore.updateLangByName("GlobalTimes", Lang.TAMIL);
        newsPaperStore.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(InkColor.GREEN, 12, 16, "GlobalTimes", 31.0, 210.0);
		NewsPaper replacement = new NewsPaper(Lang.TELUGU, "Premium", 6.2, 27, "NewEra", 32.5, 225, "HeadX", "FootX", 14, 7, "Shivananda", "Karnataka", InkColor.BLACK, 13);
        newsPaperStore.replaceByPrintHouseAddress("Delhi", replacement);
        newsPaperStore.displayAll();
    }
}