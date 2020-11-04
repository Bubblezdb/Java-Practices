/**
	*Defining the milesTraveled
	*/
	
public class milesTraveled
{
	private double hour;
	private double speed;
	private double distance = hour * speed;
	
	
	
	/**
	* The setHour method accepts an argument 
	* that is stored in hour field.
	*/
	
	public void setHour(double totalHours)
	{
		hour=totalHours;
	}
	
	/**
	* The setSpeed method accepts an argument 
	* that is stored in Speed field.
	*/
	
	public void setSpeed(double totalSpeed)
	{
		speed= totalSpeed;
	}
	
	/** 
	* The getDistance method calculates the distance traveled. 
	*/
	
	public double getDistance()
	{
		return distance;
	}
	
	
}
		