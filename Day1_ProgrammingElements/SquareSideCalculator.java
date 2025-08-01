
import java.util.*;
public class SquareSideCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        // Calculate side of the square
        double side = perimeter / 4;
        // Print the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);

        scanner.close();
	}

}
