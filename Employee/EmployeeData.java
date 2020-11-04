import java.util.Scanner; // Needed for Scanner class

/** 
* This program creates three instances for the 
* Employee Class.
*/

public class EmployeeData
{
	public static void main (String[] args)
	{
		String make; // To hold the employee's name
		int speed; //to hold the employee's department
		int yearModel; // to hold the employee's ID number
		
		//Creates Four employee objects
		Car fast = new Car();
		Car slow= new Car();
		
		
		
		//create a Scanner object for Keyboard input.
		Scanner keyboard= new Scanner(System.in);
		
		//Get and store the first employee information
		System.out.print("Car make: ");
		make = keyboard.nextLine();
		fast.setMake(make);
		System.out.print("Car model year: " );
		yearModel = keyboard.nextInt();
		fast.setModelYear(yearModel);
		
		
		
		// group information about employees
		firstEmployee= first.getName()  + first.getIdnumber()  + first.getDepartment()  + first.getPosition();
		secondEmployee= second.getName() + second.getIdnumber() + second.getDepartment() + second.getPosition();
		thirdEmployee= third.getName() + third.getIdnumber() + third.getDepartment()+ third.getPosition();
		
		// display information
		System.out.println("The first employee is: " + firstEmployee);
		System.out.println("The second employee is: " +secondEmployee);
		System.out.println("The third employee is: " + thirdEmployee);
		
		
		
	}
}