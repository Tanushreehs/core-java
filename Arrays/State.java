class State {
    String stateName;
    int population;
    City[] cityList;
    State(String stateName, int population, City[] cityList) {
        this.stateName = stateName;
        this.population = population;
        this.cityList = cityList;
    }
}