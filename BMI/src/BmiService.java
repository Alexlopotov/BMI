public class BmiService {
    public double calculate(double mass, double height) {

        double bmi = mass / (height * height);
        double roundOff = (double) Math.round(bmi * 10) / 10;
        return roundOff;
    }


}
