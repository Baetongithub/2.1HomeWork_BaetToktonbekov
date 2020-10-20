package com.company;

public class Eurasia {
    private  double area;
    private CitiesOfTheEurasia cities;

    public Eurasia(double area, CitiesOfTheEurasia cities) {
        this.area = area;
        this.cities = cities;
    }

    public double getArea() {
        return area;
    }

    public CitiesOfTheEurasia getCities() {
        return cities;
    }
}
