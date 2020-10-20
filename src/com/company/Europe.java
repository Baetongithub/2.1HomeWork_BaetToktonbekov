package com.company;

public class Europe extends Eurasia {
    private int foundationDate;

    public Europe(double area, CitiesOfTheEurasia cities, int foundationDate) {
        super(area, cities);
        this.foundationDate = foundationDate;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

    public final void northEurope(String countries) {
        System.out.println(countries);
    }

    public void northEurope(String country, String greatestEmpire) {
        System.out.println("Empire is " + greatestEmpire + "\nCountry: " + country);
    }

    public void printInfo(){
        System.out.println("Area is " + getArea() + "km²" +
                "\nFoundation Date: " + getFoundationDate() + " - y." +
                "\nCity Name: " + getCities() +
                "\n___________________");
    }
}
