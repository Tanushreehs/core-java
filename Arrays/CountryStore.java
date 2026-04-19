class CountryStore {
    Country[] countryList = new Country[10];
    int index = 0;

    void save(Country country) {
        if (country != null) {
            if (index < countryList.length) {
                countryList[index] = country;
                System.out.println("Country saved at index: " + index);
                index++;
            } else {
                System.out.println("Store is full");
            }
        } else {
            System.out.println("Country cannot be null");
        }
    }

    Country findByName(String searchName) {
        if (searchName != null) {
            for (int start = 0; start < countryList.length; start++) {
                Country country = countryList[start];
                if (country != null && country.countryName != null) {
                    if (country.countryName == searchName) {
                        System.out.println("Country found: " + searchName);
                        return country;
                    }
                }
            }
        }
        System.out.println("Country not found");
        return null;
    }

    State findStateByStateName(String searchStateName) {
        if (searchStateName != null) {
            for (int start = 0; start < countryList.length; start++) {
                Country country = countryList[start];
                if (country != null && country.stateList != null) {
                    for (int innerStart = 0; innerStart < country.stateList.length; innerStart++) {
                        State state = country.stateList[innerStart];
                        if (state != null && state.stateName != null) {
                            if (state.stateName == searchStateName) {
                                System.out.println("State found: " + searchStateName);
                                return state;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("State not found");
        return null;
    }

    City[] findAllCityByStateName(String searchStateName) {
        State state = findStateByStateName(searchStateName);
        if (state != null && state.cityList != null) {
            System.out.println("Cities found for state: " + searchStateName);
            return state.cityList;
        }
        System.out.println("No cities found");
        return null;
    }

    int findNoOfDistrictsByCityName(String searchCityName) {
        if (searchCityName != null) {
            for (int start = 0; start < countryList.length; start++) {
                Country country = countryList[start];
                if (country != null && country.stateList != null) {
                    for (int innerStart = 0; innerStart < country.stateList.length; innerStart++) {
                        State state = country.stateList[innerStart];
                        if (state != null && state.cityList != null) {
                            for (int innerStart2 = 0; innerStart2 < state.cityList.length; innerStart2++) {
                                City city = state.cityList[innerStart2];
                                if (city != null && city.cityName != null) {
                                    if (city.cityName == searchCityName) {
                                        System.out.println("City found: " + searchCityName);
                                        System.out.println("Number of districts: " + city.numberOfDistricts);
                                        return city.numberOfDistricts;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("City not found");
        return 0;
    }

    Country findByCollectorName(String searchCollectorName) {
        if (searchCollectorName != null) {
            for (int start = 0; start < countryList.length; start++) {
                Country country = countryList[start];
                if (country != null && country.stateList != null) {
                    for (int innerStart = 0; innerStart < country.stateList.length; innerStart++) {
                        State state = country.stateList[innerStart];
                        if (state != null && state.cityList != null) {
                            for (int innerStart2 = 0; innerStart2 < state.cityList.length; innerStart2++) {
                                City city = state.cityList[innerStart2];
                                if (city != null && city.districtList != null) {
                                    for (int innerStart3 = 0; innerStart3 < city.districtList.length; innerStart3++) {
                                        District district = city.districtList[innerStart3];
                                        if (district != null && district.collector != null && district.collector.collectorName != null) {
                                            if (district.collector.collectorName == searchCollectorName) {
                                                System.out.println("Collector found: " + searchCollectorName);
                                                System.out.println("Country: " + country.countryName);
                                                return country;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Collector not found");
        return null;
    }
}