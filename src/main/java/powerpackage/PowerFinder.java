package powerpackage;

public class PowerFinder {

    public static int calculatePower(int base, int exponent) {
        int powerValue = 1;
        for (int i = 0; i<base; i++) {
            powerValue *= exponent;
        }
        return powerValue;
    }
}
