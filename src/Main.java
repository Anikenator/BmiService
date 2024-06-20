public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(1.87, 98);
        int index = (int) result;
        System.out.println(index);
    }
}
