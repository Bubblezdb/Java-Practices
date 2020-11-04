/**
 *  The CellPhone class represents a cell phone.
 */

public class CellPhone
{
   // Fields
   private String fullName;    // Manufacturer
   private String fullAddress;       // Model
   private int fullAge
   private double phNumber; // Retail price
   
   /**
    *  The constructor accepts arguments for
    *  the phone's manufacturer, model number,
    *  and retail price.
    */
   
   public CellPhone(String name, String address,int age, double phNumber)
   {
      fullName = name;
      fullAddress = address;
      fullAge = age;
	  phNumber= number;
   }
   
   /**
    *  The setManufact method accepts an argument for
    *  the phone's manufacturer name.
    */
   
   public void setName(String name)
   {
      fullName = name;
   }

   /**
    *  The setModelNumber method accepts an argument
    *  for the phone's model number.
    */
      
   public void setAddress(String address)
   {
      fullAddress = address;
   }
   
   /**
    *  The setRetailPrice method accepts an argument
    *  for the phone's retail price.
    */
      
   public void setAge(int age)
   {
      fullAge = age;
   }
   
   public void setPhone(double number)
   {
      phNumber = number;
   }

   /**
    * The getManufact method returns the name of
    * the phone's manufacturer.
    */
   
   public String getFullname()
   {
      return fullName;
   }
   
   /**
    *  The getModel method returns the phone's
    *  model number.
    */
   
   public String getAddress()
   {
      return fullAddress;
   }
   
   /**
    *  The getRetailPrice method returns the
    *  phone's retail price.
    */
   
   public int getAge()
   {
      return fullAge;
   }
    public double getPhone()
   {
      return phNumber;
   }
}