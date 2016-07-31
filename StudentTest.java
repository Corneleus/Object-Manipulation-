package ObjectManipulation;

//Cory Caswell 
// test
public class StudentTest 
{// start of class
	//method main
	public static void main ( String []  args)
	{
		// student 1
		Student student1 = new Student ("Bob Bobberson" , 3.0 , "NOVA");// inital values
		testValues ( student1 );// method call acting on the first students info
		student1.setName ( "Ludwig Dude bro" );// set methods
		student1.setSName ( "William and Mary" );
		student1.setGpa ( 2.5 );
		testValues ( student1 );// after changing the values it method calls
		// test values to see how they have changed
		
		// student 2
		Student student2 = new Student ("Foaux Greenburg" , 3.9 ,
				"GMU");
		testValues ( student2 );
		student2.setName ( "George Gunderson" );
		student2.setSName ( "UVA" );
		student2.setGpa ( 1.9 );
		testValues ( student2 );
		
		
	}//end method main
	/**
	 * 
	 * @param stu
	 */
	public static void testValues ( Student stu )// using the Student class making a peram
	// stu to call stuff
	{
		System.out.printf ( "Students Name: %s\n" ,
				stu.getName() );
		
		System.out.printf ( "Students School's name: %s\n" ,
				stu.getSName() );
		
		System.out.printf ( "Students GPA: %.1f\n" ,
				stu.getGpa() );
			
		System.out.printf("Student has a: %.0f" + "%%" + "\n", 
				stu.getGPAasPercent() );
		
		
		System.out.printf("Full Info: %s" + "%%" + "\n", 
				stu.toString() );
		
	}//end method test values

	


}//end class EmployeeTest


