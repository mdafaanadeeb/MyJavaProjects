import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: weight and height
        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in centimeters): ");
        double heightCm = scanner.nextDouble();
        double height = heightCm / 100;  // Convert cm to meters

        scanner.close();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Output BMI and Category
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Category: " + getBMICategory(bmi));
    }

    // Method to determine BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
}