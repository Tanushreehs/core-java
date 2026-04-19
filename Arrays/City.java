class City {
    String cityName;
    int numberOfDistricts;
    District[] districtList;
	City(String cityName, District[] districtList){
        this.cityName = cityName;
        this.districtList = districtList;
        this.numberOfDistricts = districtList.length;
    }
}