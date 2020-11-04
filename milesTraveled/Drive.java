 import java.util.Scanner;// Needed for the Scanner class
 import java.io.*;
 /**
	*This program should ask the following 
	*questions to determine the distance traveled over time.
	*/
	
public class Drive
{
	public static void main (String[] args) throws IOException
	{
		
		double hour; // to hold the # of hours driven
		double speed; // to hold the speed driven
		double allHour;// loop control variable
		double distance;
		
		
		
		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Create a mileTraveled object.
		milesTraveled car = new milesTraveled();
		
		// get the number of hours spent driving.
		System.out.print("Enter the number of hours spent driving: ");
		hour= keyboard.nextDouble();
		
		//validate the input
		while (hour<1)
		{
			System.out.println("Please do not enter a value less than 1 hour.");
			System.out.print("Enter the number of hours spent driving: ");
			hour= keyboard.nextDouble();
		}
		
		//get the speed driven.
		System.out.print("Enter the speed you were going in mph: ");
		speed= keyboard.nextDouble();
		//validate the input
		while (speed<0)
		{
			System.out.println("Please do not enter a negative number.");
			System.out.print("Enter the speed you were going in mph: ");
			speed= keyboard.nextDouble();
		}
		//Pass the # of hours and speed to the set Method.
		car.set(speed);
		
		
		
		PrintWriter outputFile = new PrintWriter("SpeedData.txt");
		
		//Display the Table headings.
		outputFile.println("Hour\t\tDistance(miles)");
		outputFile.println("-----------------");
		
		//Display the distances.
		for (allHour = 1; allHour<= hour; allHour++)
		{
			distance = car.getDistance(allHour);
			outputFile.println(allHour + "\t\t" + distance);
		}
		
		outputFile.close();
		System.out.println("Data written to the file.");
		
	}

}
		