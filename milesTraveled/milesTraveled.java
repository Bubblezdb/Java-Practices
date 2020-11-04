/**
	*Defining the milesTraveled
	*/
	
public class milesTraveled
{
	private double hour;
	private double speed;

	
	

	/**
	* The setSpeed method accepts an argument 
	* that is stored in Speed field.
	*/
	
	public void set(double totalSpeed)
	{
		speed= totalSpeed;
		
	}
	
	/** 
	* The getDistance method calculates the distance traveled. 
	*/
	
	public double getDistance(double hour)
	{
		return (hour*speed);
	}
	
	
}
		