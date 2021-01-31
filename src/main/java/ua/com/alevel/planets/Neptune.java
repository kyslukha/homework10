package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Neptune extends Planet implements PlanetAcceleration {
    private double radius = 24.76 * Math.pow(10, 6);
    private double weight = 102.0 * Math.pow(10, 24);

    public Neptune() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
