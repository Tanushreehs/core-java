class Country {
    String countryName;
    President president;
    State[] stateList;
    Country(String countryName, President president, State[] stateList) {
        this.countryName = countryName;
        this.president = president;
        this.stateList = stateList;
    }
}