package ObjectManipulation;
//Cory Caswell 
// test
public class EmployeeTest 
{// start of class
	//method main
	public static void main ( String []  args)
	{
		// employee 1
		Employee employee1 = new Employee ("Bob" , "Bobberson" ,
				-3200);
		testValues ( employee1 );
		employee1.setFirstName ( "Ludwig" );
		employee1.setLastName ( "Ivanosky" );
		employee1.setMonthlySalary ( -6000 );
		testValues ( employee1 );
		
		// employee 2
		Employee employee2 = new Employee ("Foaux" , "Greenberg" ,
				3200);
		testValues ( employee2 );
		employee2.setFirstName ( "George" );
		employee2.setLastName ( "Gunderson" );
		employee2.setMonthlySalary ( 4000 );
		testValues ( employee2 );
		
		
	}//end method main

	public static void testValues ( Employee emp )
	{
		System.out.printf ( "Employee First Name: %s\n" ,
				emp.getFirstName() );
		
		System.out.printf ( "Employee Last Name: %s\n" ,
				emp.getLastName() );
		
		System.out.printf ( "Employee Monthly Salary: %.2f\n" ,
				emp.getMonthlySalary() );
		
		System.out.printf ( "Employee Yearly Salary: %.2f\n" ,
				emp.yearlySalary() );
		
		emp.raise();
		
		System.out.printf ( "Employee Yearly Salary After Raise: %.2f\n" ,
				emp.yearlySalary() );
		
	}//end method test values

	


}//end class EmployeeTest


