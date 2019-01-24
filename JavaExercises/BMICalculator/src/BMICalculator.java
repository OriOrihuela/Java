public class BMICalculator {

    // Properties:
        double weight = 0;
        double height = 0;

    // Constructor:
        public BMICalculator(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }
    // Getters and setters:
        public double calculateBMI() {
            return weight / (height * height);
        }

    // Main behaviour:
        public static void main(String[] args) {
            BMICalculator calculator = new BMICalculator(60, 1.70);
            double bmi = calculator.calculateBMI();

            // print BMI to screen
            System.out.println("Your BMI is " + bmi + ".");
        }
}

