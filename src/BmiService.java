public class BmiService {

    public double calculate(double bodyMass, double bodyHeight) {
        double result;
        if (bodyMass > 0) {
            result = bodyMass / Math.pow(bodyHeight, 2);
        } else {
            result = 0;
        }
        return result;
    }
}
