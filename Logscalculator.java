/****************************************************************************
 * Created by: Younes Elfeitori
 * Created on: 15 September 2018
 * The program calculates the amount of logs the truck can carry
 ****************************************************************************/
import java.util.Scanner;

public class Logscalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert the length of th logs (0.25m,0.5m, or 1m)");
		double LengthOfLog = scanner.nextDouble();
		scanner.close();
		//Section above asks the user for their input
		
		// Test the input whether valid
		if(LengthOfLog != 0.25 && LengthOfLog != 0.5 && LengthOfLog != 1) {
			System.out.println(" You are only able to insert either (0.25m,0.5m, or 1m)");
		}else {
			int NumberOfLog = (int) (1100/(LengthOfLog * 20));			
			System.out.println("Truck could carry " + NumberOfLog + " logs that are " + LengthOfLog + " meters long. ");
		}
		
	}

}
