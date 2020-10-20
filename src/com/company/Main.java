package com.company;

public class Main {

    public static void main(String[] args) {

        Europe scotland = new Europe(77.91, CitiesOfTheEurasia.EDINBURGH,
                843);

        scotland.northEurope("Scotland", "Kingdom Of Scotland, 843 — 1707-yy.");
        scotland.printInfo();


        Netherlands amsterdam = new Netherlands(219.3, CitiesOfTheEurasia.AMSTERDAM,
                1300, new PeopleOfNetherlands(821752, 177));

        amsterdam.mostBeautifulPlaces("Of Amsterdam: Vondel Park, Amsterdam Zoo, " +
                "Herengracht, Hortus Botanicus");
        amsterdam.printInfo();


        Netherlands rotterdam = new Netherlands(325.8, CitiesOfTheEurasia.ROTTERDAM, 1340,
                new PeopleOfNetherlands(631155, 180));

        rotterdam.mostBeautifulPlaces("In Rotterdam: Kunsthal Rotterdam, " +
                "Maritime Museum Rotterdam, etc.", "CityHub Rotterdam, H2OTEL, nhow Rotterdam, etc.");
        rotterdam.printInfo();
    }
}
