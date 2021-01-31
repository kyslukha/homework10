package ua.com.alevel.planets;
import lombok.Getter;
import lombok.Setter;
import ua.com.alevel.util.AccelerationUtil;

@Getter
@Setter

public class Venus extends Planet implements PlanetAcceleration {
    public double radius  = 6.051 * Math.pow(10, 6);
    public double weight = 4.87 * Math.pow(10, 24);


    public Venus() {
        super();
    }

    @Override
    public double acceleration() {
        return AccelerationUtil.freeFallAcceleration(getRadius(), getWeight());
    }

}
