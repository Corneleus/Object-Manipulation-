package ObjectManipulation;

public class InvoiceTest 

{// start the class
	public static  void main( String[] args )
	{
		Invoice invoice1 = new Invoice ( "0042", "Screw, 3/4\"" ,
				2, .95);
	
		testValues ( invoice1 );
		invoice1.setPartDescription ( "Wood" );
		invoice1.setPartNumber ( "0046" );
		invoice1.setQuantity( 5 );
		invoice1.setPrice( 1.10 );
		testValues ( invoice1 );
		
	}//end main method
	
	public static void testValues ( Invoice inv )
	
	{
		System.out.printf ( "Invoice Part Number: %s\n",
				inv.getPartNumber( ) );
		
		System.out.printf ( "Invoice Part Description: %s\n", 
				inv.getPartDescription( ) );
	
		System.out.printf ( "Invoice Quantity Sold: %d\n", 
				inv.getQuantity( ) );
		
		System.out.printf ( "Invoice Price: %.2f\n", 
				inv.getPrice( ) );
	
		System.out.printf ( "Total Invoice Amount: %.2f\n\n", 
				inv.getInvoiceAmount( ) );
	
	}//end method testValues
}// end class 
