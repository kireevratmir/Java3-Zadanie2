public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.82;
        int weight = 88;
        int index = (int)service.calculate(height, weight);
        System.out.println(index);
    }
}