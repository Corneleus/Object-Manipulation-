package ObjectManipulation;
// Cory Caswell Csc 201
// Fig. 7.13: Account.java
// Account class with a constructor to validate and 
// initialize instance variable balance of type double.

public class Account
{   
  private double balance; // instance variable that stores the balance
  
  public static void main(String [] args)
  {
	  Account account1 = new Account(1000.0);
	  account1.getBalance ();
	  account1.debit( 1001.0 );
	  account1.debit( 1.0 );
	  account1.getBalance();
  }
  
  
  // constructor  
    public Account( double initialBalance )
   {
      // validate that initialBalance is greater than 0.0; 
      // if it is not, balance is initialized to the default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
   } // end Account constructor

   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance += amount; // add amount to balance 
   } // end method credit
   // withdrawing money from the account
   public void debit(double withdraw)
   {
	   if (withdraw > balance )
	   {
		   System.out.print("Debit amount exceeded account balance.");   
	   }
	   else 
	   {
		  balance -= withdraw; 
	   }
   }  
   // return the account balance
   public double getBalance()
   {
      return balance; // gives the value of balance to the calling method
   } // end method getBalance
} // end class Account


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