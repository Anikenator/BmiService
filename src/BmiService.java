public class BmiService {
    public double calculate(double height, int weight) {
        double result = weight / (height * height);
        int index = (int) result;
        return index;
    }
}
