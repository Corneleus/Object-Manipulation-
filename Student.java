package ObjectManipulation;
/**
 * a class that gets and sets values and names for a student going to a school a 
 * a certain gpa
 * 
 * @author Cory Caswell
 * @version 1.0
 * @since 04-27-15
 *
 */

public class Student 
{
	private String name;
	private double gpa;
	private String sName;
	private double percent = 95;
	
	/**
	 * Default Constructor
	 * @param null
	 * 
	 */
	public Student()
	{
		
	}
	
	/**
	 * This is the explicit Constructor
	 * 
	 * @param name
	 * 				for the students name
	 * @param gpa
	 * 				for the students gpa
	 * @param sName
	 * 				for the students school 
	 * 
	 *
	 */				
	
	public Student(String name, double gpa, String sName)
	{
		this.name = name;
		this.gpa = gpa;
		this.sName = sName;
	}
	
	/**
	 * Over writing the toString method
	 */
	
	public String toString()
	{
		return (name + " " + gpa + " " + sName + " " + percent);
	}
	
	/**
	 * This method gets the students name 
	 * 
	 * @return students name
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * This method sets the name of name to something else
	 * 
	 * @param name sets the name to something else
	 */
		
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * This method returns the gpa
	 * 
	 * @return the gpa that has been set as a double value from 0.0 to 4.0
	 */
	
	public double getGpa()
	{
		return gpa;
	}

	/**
	 * This method sets the gpa to new value
	 * @param gpa sets the gpa to new value
	 */
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}

	/**
	 * This method gets the schools name
	 * 
	 * @return sName returns the schools name
	 */
	public String getSName()
	{
		return sName;
	}
	
	/**
	 * This method sets the schools name to something else
	 * @param sName sets the name to a new name
	 */
	public void setSName(String sName)
	{
		this.sName = sName;
	}
	
	/**
	 * This method sets the percent to something else
	 * @param percent sets the percent to a new percent
	 */
	public void setPercent(double percent)
	{
		this.percent = percent;
		

	}
	/**
	 * This method returns a percent based on gpa
	 * 
	 * @return returns percent based on on gpa
	 */
	public double getGPAasPercent()
	{
		for(double i = 4.0 ; i > gpa ; i -= .1  )
		{
			percent--;
		}
				
		return percent;
		
	}



}


