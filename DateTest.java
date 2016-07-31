package ObjectManipulation;
// Cory Caswell
//class date test
public class DateTest 
{
	// begin method main
	public static void main( String[] args )
	   { 
		// regular date
		Date date1 = new Date ( 02, 17 , 1901);
		
		// test values to check date
		testDate ( date1 );
		date1.setCurrentDay ( 27 );
		date1.setCurrentMonth ( 11 );
		date1.setCurrentYear( 2234 );
		testDate ( date1 );

	
		
	   }// end method main
	// method to call display date method
	public static void testDate ( Date date1)
	{
		 date1.displayDate ();
		 
	}// end of test date method
	
}//end class Date Test