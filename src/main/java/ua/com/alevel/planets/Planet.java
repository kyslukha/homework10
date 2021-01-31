package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Planet implements PlanetAcceleration {
    private double radius;
    private double weight;

}
