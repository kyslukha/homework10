package ua.com.alevel;

import ua.com.alevel.info.*;
import ua.com.alevel.planets.*;

public class Main {
    public static void main(String[] args) {
        PlanetScanner scanner = new PlanetScanner();
        PlanetReporter reporter = new PlanetReporter();
        String planetName = scanner.getPlanet();
        Planet planet = planetInit(planetName);
        double acceleration = planet.acceleration();
        reporter.getInfo(planetName, acceleration);
    }

    private static Planet planetInit(String planetName) {
        Planet namePlanet;
        switch (planetName) {
            case "Mercury":
                namePlanet = new Mercury();
                break;
            case "Venus":
                namePlanet = new Venus();
                break;
            case "Earth":
                namePlanet = new Earth();
                break;
            case "Mars":
                namePlanet = new Mars();
                break;
            case "Jupiter":
                namePlanet = new Jupiter();
                break;
            case "Saturn":
                namePlanet = new Saturn();
                break;
            case "Uranus":
                namePlanet = new Uranus();
                break;
            case "Neptune":
                namePlanet = new Neptune();
                break;
            default:
                throw new RuntimeException("Wrong name of planet. Try again");
        }
        return namePlanet;
    }
}
