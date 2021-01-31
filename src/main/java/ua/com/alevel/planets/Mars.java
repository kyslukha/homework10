package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Mars extends Planet implements PlanetAcceleration {
    private double radius = 3.396 * Math.pow(10, 6);
    private double weight = 0.64 * Math.pow(10, 24);

    public Mars() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
