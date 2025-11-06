public class Main {
    public static void main(String[] args) {
        double height = 1.75;
        double weight = 70.0;
        double bmi = BMI.calculateBmi(height, weight);
        System.out.println("Your BMI is: " + bmi);
    }
}
