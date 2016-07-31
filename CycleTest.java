package ObjectManipulation;

public class CycleTest 
{
	public static void main(String [] args)
	{
		Cycle cycle1 = new Cycle (300 , 4000);
		testValues ( cycle1 );
					
		
		Cycle cycle2 = new Cycle ();
		testValues ( cycle2 );
						
	}
	
	public static void testValues ( Cycle cycle )
	{
		System.out.printf ( "Values for Number of wheels and weight are "
				+ ": %s \n" , cycle.toString() );
				
	}
}
