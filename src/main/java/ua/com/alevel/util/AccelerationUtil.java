package ua.com.alevel.util;

public final class AccelerationUtil {
    private static final double gravitationalConst = 6.674 * Math.pow(10, -11);

    public static double freeFallAcceleration(double radius, double weight) {
        return gravitationalConst * weight / Math.pow(radius, 2);
    };
}
