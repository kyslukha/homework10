package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Jupiter extends Planet implements PlanetAcceleration {
    private double radius = 71.49 * Math.pow(10, 6);
    private double weight = 1898.0 * Math.pow(10, 24);

    public Jupiter() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
