package ObjectManipulation;
//Cory Caswell CSC 201 Home work
// Fig. 7.4: GradeBook.java
// Class declaration with a method that has a parameter.

public class GradeBook
{
	private String name;
  
	private  String course; 
	
	public GradeBook( String course , String name  )
	{
		this.name = name;
		this.course = course;
		
	}
	
	public void setCourse( String newCourse )
	{
		course = newCourse;
	}
	
	public String getCourse()
	{
		return  course;
	}
	
	
	public void setName(String newName)
	{
		name = newName;
	}

	public String getName()
	{
		return name;
	}
	// display a welcome message to the GradeBook user
   public void displayMessage( )
   {
      System.out.printf( "Welcome to the grade book for: %s!\n", 
         course ); 
      System.out.printf ( "This course is presented by: %s\n", name);
   } // end method displayMessage
} // end class GradeBook


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
