package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter

public class Mercury extends Planet implements PlanetAcceleration {
    private double radius = 2.439 * Math.pow(10, 6);
    private double weight = 0.33 * Math.pow(10, 24);

    public Mercury() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
