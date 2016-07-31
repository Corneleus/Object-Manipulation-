package ObjectManipulation;
// Cory Caswell CSC 201
// Fig. 7.14: AccountTest.java
// Manipulating Account objects and validating initializer values.
import java.util.Scanner;

public class AccountTest
{
   private static Scanner input;

// main method begins execution of Java application
   public static void main( String[] args ) 
   {
      Account account1 = new Account( 50.00 ); // create Account object
      Account account2 = new Account( -7.53 ); // create Account object

      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      
      input = new Scanner( System.in );
      double debitAmount; // deposit amount read from user

      System.out.println( "Enter withdraw amount for account1: " ); // prompt
      debitAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nwithdrawing %.2f from account1 balance\n\n", 
         debitAmount );
      account1.debit( debitAmount ); // add to account1 balance

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );

      System.out.print( "Enter withdraw amount for account2: " ); // prompt
      debitAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nwithdrawing %.2f from account2 balance\n\n", 
         debitAmount );
      account2.debit( debitAmount ); // add to account2 balance

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
   } // end main
} // end class AccountTest


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