package org.itstep.task03;

import org.itstep.task02.City;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities;

    public Country() {
        cities = new City[0];
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        cities = new City[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void addCity(City city){
        final int length = this.cities.length;
        cities= Arrays.copyOf(cities,length+1);
        cities[length] = city;
    }

    public int getInhabitants(){
        int count=0;
        count= Arrays.stream(cities).mapToInt(c -> c.getInhabitants()).sum();
        return count;
    }
}
