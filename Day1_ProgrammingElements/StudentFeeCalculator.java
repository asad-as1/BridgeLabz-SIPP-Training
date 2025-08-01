import java.util.*;

public class StudentFeeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final amount to pay
        double finalFee = fee - discount;

        // Print results
        System.out.printf("The discount amount is INR %.2f%n", discount);
        System.out.printf("The final discounted fee is INR %.2f%n", finalFee);

        scanner.close();
	}

}
