package ua.com.alevel.planets;

import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Saturn extends Planet implements PlanetAcceleration {
    private double radius = 60.27 * Math.pow(10, 6);
    private double weight = 568.0 * Math.pow(10, 24);

    public Saturn() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
