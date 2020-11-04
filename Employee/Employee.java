/**
 * Employee class
 */

public class Employee
{
   private String fullName;
   private String fullDepartment;
   private String fullPosition;
   private int fullIDNumber;

   /**
    * Constructor
    */

   public Employee()
   {
      String fullName;
	  String fullDepartment;
	  String fullPosition;
	  int fullIDNumber;
   }

   /**
    * The setName method accepts an argument
    * that is stored in the fullname field. 
    */

   public void setName(String name)
   {
      fullName = name;
   }
   
    public void setIdnumber(int number)
   {
      fullIDNumber= number;
   }


   /**
    * The setDepartment method accepts an argument
    * that is stored in the fullDepartment field.
    */

   public void setDepartment(String department)
   {
      fullDepartment= department;
   }

   
  
	 /**
    * The setPosition method accepts an argument
    * that is stored in the fullposition field.
    */

   public void setPosition(String position)
   {
      fullPosition= position;
   }

   
   
   /**
    * The complete method accepts 4 arguments
    * 
    */
   public void complete(String name,int number, String department, String position )
   {
      fullName = name;
      fullIDNumber= number;
	  fullDepartment= department;
	  fullPosition= position;
	  
   }

   /**
    * Thees  method returns the value
    * stored in the length field.
    */

   public String getName()
   {
      return fullName;
   }
    public int getIdnumber()
   {
      return fullIDNumber;
   }
    public String getDepartment()
   {
      return fullDepartment;
   }
    public String getPosition()
   {
      return fullPosition;
   }


   

   
}
