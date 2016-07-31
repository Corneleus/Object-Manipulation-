package ObjectManipulation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CycleThrowTryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cycle cycle = new Cycle(0, 0);
		
		System.out.println("Enter weight: ");
		try {
			cycle.setWeight(scan.nextDouble());
			System.out.println("Enter number of wheels:");
			cycle.setNumberOfWheels(scan.nextDouble());
		}
		catch(InputMismatchException e) {
			System.out.println("The value entered must be a double.");
		}
		
		System.out.println(cycle.toString());
	}
}
