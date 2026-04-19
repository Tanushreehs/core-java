class CountryRunner{
    public static void main(String[] args){

        CountryStore countryStore=new CountryStore();

        Address address=new Address(101,560001);
        President president=new President("DroupadiMurmu",65,address);
        Collector collector1=new Collector("Tanu",2010);
        Collector collector2=new Collector("Anu",2011);
        Collector collector3=new Collector("Sindhu",2012);
        Collector collector4=new Collector("Varshitha",2013);
        Collector collector5=new Collector("Thushar",2014);
        Collector collector6=new Collector("Kiran",2015);
        Collector collector7=new Collector("Shivanand",2016);
        Collector collector8=new Collector("Gowramma",2017);
        Collector collector9=new Collector("Hema",2018);
        Collector collector10=new Collector("Gnaanu",2019);
        District district1=new District("Chamrajpet",collector1);
        District district2=new District("Yelahanka",collector2);
        District district3=new District("KRpet",collector3);
        District district4=new District("Teynampet",collector4);
        District district5=new District("AnnaNagar",collector5);
        District district6=new District("ShivajiNagar",collector6);
        District district7=new District("Andheri",collector7);
        District district8=new District("Borivali",collector8);
        District district9=new District("BapuNagar",collector9);
        District district10=new District("Adajan",collector10);
        District[] d1={district1,district10,};
        District[] d2={district2,district6,district8};
        District[] d3={district3};
        District[] d4={district4};
        District[] d5={district5};
        District[] d6={district6};
        District[] d7={district7};
        District[] d8={district8};
        District[] d9={district9};
        District[] d10={district10};
        City city1=new City("Bangalore",d1);
        City city2=new City("Mysuru",d2);
        City city3=new City("Hassan",d3);
		City city4=new City("Chennai",d4);
        City city5=new City("Madurai",d5);
        City city6=new City("Mumbai",d6);
        City city7=new City("Pune",d7);
        City city8=new City("Ahmedabad",d8);
        City city9=new City("Surat",d9);
        City city10=new City("Jaipur",d10);
        City[] karnatakaCities={city1,city2,city3};
        City[] tamilCities={city4,city5};
        City[] maharashtraCities={city6,city7};
        City[] gujaratCities={city8,city9};
        City[] rajasthanCities={city10};
        State state1=new State("Karnataka",60000000,karnatakaCities);
        State state2=new State("TamilNadu",70000000,tamilCities);
        State state3=new State("Maharashtra",90000000,maharashtraCities);
        State state4=new State("Gujarat",65000000,gujaratCities);
        State state5=new State("Rajasthan",80000000,rajasthanCities);
        State state6=new State("Kerala",35000000,karnatakaCities);
        State state7=new State("AndhraPradesh",50000000,tamilCities);
        State state8=new State("Telangana",40000000,maharashtraCities);
        State state9=new State("Punjab",30000000,gujaratCities);
        State state10=new State("Odisha",45000000,rajasthanCities);
        State[] states={state1,state2,state3,state4,state5,state6,state7,state8,state9,state10};
        Country country=new Country("India",president,states);
        countryStore.save(country);
        countryStore.findByName("India");
        countryStore.findStateByStateName("Karnataka");
       City[] result=countryStore.findAllCityByStateName("Karnataka");
        if(result!=null){
            for(int start=0;start<result.length;start++){
                if(result[start]!=null){
                    System.out.println("City: "+result[start].cityName);
                }
            }
        }

        countryStore.findNoOfDistrictsByCityName("Mysuru");
        countryStore.findByCollectorName("Tanu");
    }
}