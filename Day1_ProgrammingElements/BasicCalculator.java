import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Take user input for the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Take user input for the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN;

        // Print the results
        System.out.printf("The addition, subtraction, multiplication and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n",
                number1, number2, addition, subtraction, multiplication, division);

        scanner.close();
    }
}
