package ObjectManipulation;
// Cory Caswell
// Class
public class Date 
{	
	private int currentMonth;
	private int currentDay;
	private int currentYear;

	// constructor 
	public Date ( int month, int day, int year)
	{
		currentMonth = month; 
		currentDay = day; 
		currentYear = year;
	
	}// end constructor

	public int getCurrentMonth()
	{
		return currentMonth;
	}

	public int getCurrentDay()
	{
		return currentDay;
	}
	
	public int getCurrentYear()
	{
		return currentYear;
	}
	
	public  void setCurrentMonth ( int newMonth )
	{
		currentMonth = newMonth;
	}
	
	public void setCurrentDay ( int newDay )
	{
		currentDay = newDay;
	}
	
	public void setCurrentYear ( int newYear )
	{
		currentYear = newYear;
	}
	
	public void displayDate ()
	{
		
		System.out.printf ("Today's Date is: %d / %d / %d \n", currentMonth, currentDay
				, currentYear );
		
	}
	


}// end public class Date


