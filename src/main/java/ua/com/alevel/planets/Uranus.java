package ua.com.alevel.planets;
import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter
public class Uranus extends Planet implements PlanetAcceleration {
    private double radius = 25.5 * Math.pow(10, 6);
    private double weight = 86.8 * Math.pow(10, 24);

    public Uranus() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }
}
