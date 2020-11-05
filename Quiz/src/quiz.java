import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {

			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter your height in feet (female) : ");
			int feetfemale = input.nextInt();

			System.out.print("Enter your height in inches (female) : ");
			int inchesfemale = input.nextInt();

			System.out.print("Enter your height in feet (male) : ");
			int feetmale = input.nextInt();

			System.out.print("Enter your height in inches (male) : ");
			int inchesmale = input.nextInt();

			int totalinchesf = ( 12 * (feetfemale-5) ) + inchesfemale;
			int totalinchesm = ( 12 * (feetmale-5)) + inchesmale;

			System.out.println("The ideal weight for female is " + (40 + (5 * totalinchesf)) + "kg.");
			System.out.println("The ideal weight for male is " + (50 +(6 * totalinchesm)) + "kg.");
	}

}
