public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();


double bmi = service.calculate(70, 1.78);
System.out.println(bmi);

    }
}

