package ObjectManipulation;
// Cory Caswell CSC 201
//class Employee
public class Employee 
{
	//instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	//constructor
	public Employee ( String first, String last, double monthly)
	{
		
		firstName = first;
		lastName = last;
		setMonthlySalary(monthly);
		
		
	}//end constructor
	// yearly salary calculation
	public double yearlySalary()
	{
		return monthlySalary * 12;
	}
	// raise calculation
	public void raise()
	{
		monthlySalary *= 1.1;
	}
	
	//get methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	//set methods
	public void setFirstName( String newFirst)
	{
		firstName = newFirst;
	}
	
	public void setLastName( String newLast)
	{
		lastName = newLast;
	}
	
	public void setMonthlySalary( double newMonthly)
	{
	  // if statement 
		if ( (newMonthly > 0.0) )
			   
			monthlySalary = newMonthly;
		
		
	}
	
}//end class Employee
