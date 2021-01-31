package ua.com.alevel.info;

import java.util.*;

import ua.com.alevel.planets.*;

import org.reflections.Reflections;


public class PlanetScanner {
    final private List<String> listOfPlanets = new ArrayList<>();

    public PlanetScanner() {
        Reflections reflections = new Reflections("ua.com.alevel.planets");
        Collection<Class<? extends Planet>> listPlanets = reflections.getSubTypesOf(Planet.class);
        for (Class list : listPlanets) {
            listOfPlanets.add(list.getSimpleName());
        }
    }

    public String getPlanet() {
        System.out.println("List of planets:");
        System.out.println(listOfPlanets);
        Scanner planetName = new Scanner(System.in);
        System.out.println("Please select one of the planet above for calculations its gravity");
        return planetName.nextLine();
    }
}
