package ObjectManipulation;
import java.util.Scanner;
/**
 * A class that has a method that ask the user for a radius and choice to calculate the 
 * Diameter, Circumference or , Area 
 * 
 * @author Cory Caswell
 * @version 1.0
 * @since 04-27-15
 *
 */
public class Circle 
{
	/**
	 * This method asks the user to input a radius and then asks the user
	 * to chose a one of three options to calculate and then displays the answer
	 * 
	 * @param args
	 * 
	 * 				Is the arguments provided to the program through 
	 * 				the console 
	 */				
	
	public static void main (String [] args)
	{
		double radius;
		int choice;
		
		
		System.out.print("What is the radius of the circle?: ");		
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
				
		System.out.printf("What Would you like to compute? "
				+ "\n 1) Diameter "
				+ "\n 2) Circumference "
				+ "\n 3) Area \n ");		
		
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();		
		
		while (choice != 1 && choice != 2 && choice != 3)
		{
			System.out.println("Please Enter 1 2 or 3 for Choices: ");			
			choice = input.nextInt();				
		}		
		
		if (choice == 1)
		{
			System.out.printf("The Diameter is: %.2f ", radius * 2 );
		}
		
		if (choice == 2)
		{
			System.out.printf("The Circumference is: %.2f ", (radius * 2 * Math.PI) );
		}
		
		if (choice == 3)
		{
			System.out.printf("The Area is: %.2f  ", (radius * radius) * Math.PI );
		}
		scan.close();
		input.close();
	}
}
