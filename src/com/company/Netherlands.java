package com.company;

public final class Netherlands extends Europe {
    private PeopleOfNetherlands people;

    public Netherlands(double area, CitiesOfTheEurasia cities, int foundationDate,
                       PeopleOfNetherlands people) {
        super(area, cities, foundationDate);
        this.people = people;
    }

    public PeopleOfNetherlands getPeople() {
        return people;
    }

    public void mostBeautifulPlaces(String squares) {
        System.out.println("Squares " + squares);
    }

    public void mostBeautifulPlaces(String museums, String hotels) {
        System.out.println("Museums " + museums +
                "\nBest Hotels: " + hotels);
    }

    public void mostBeautifulPlaces(String museums, String squares, String hotels) {
        System.out.println(museums + " " + squares + " " + hotels);
    }

    public void northEurope(String country, String climate) {
        System.out.println("County: " + country + "\nClimate: " + climate);
    }

    public void printInfo(){
        System.out.println("Area: " + getArea() + "km²" +
                "\nName Of City: " + getCities() +
                "\nFoundation Date: " + getFoundationDate() + " - y." +
                "\nPopulation: " + getPeople().getQuantity() +
                "\nNumber Of Nations: " + getPeople().getNations() +
                "\n___________________");
    }
}
