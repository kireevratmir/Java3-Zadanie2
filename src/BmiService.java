public class BmiService {
    public double calculate(double height, int weight) {
        double index;
        index = weight / Math.pow(height, 2);
        return (int)index;
    }
}
