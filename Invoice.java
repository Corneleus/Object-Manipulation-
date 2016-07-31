package ObjectManipulation;
// class invoice
public class Invoice 
{
	// call the set method from the constructor but add an if statement
	// instance variables
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	// constructor
	public Invoice ( String number, String description, 
		int numSold, double cost)
	{
		partNumber = number;
		partDescription = description;
		setQuantity( numSold );
		setPrice( cost );
	}
	// get invoice amount method
	public double getInvoiceAmount()
	{
		
		return getQuantity() * getPrice();
	}
	//get methods
	public String getPartNumber()
	{
		return partNumber;
	}
	
	public String getPartDescription()
	{
		return partDescription;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	//set methods
	public void setPartNumber ( String newNumber )
	{
		partNumber = newNumber;
	}

	public  void setPartDescription( String newDescription )
	{
		partDescription = newDescription;
	}

	public void setQuantity( int newQuantity )
	
	{
		if ( quantity < 0)
		{
			quantity = 0;
		}
		else  
		{
			quantity = newQuantity;
		}
			
	}

	public void setPrice( double newPrice )
	
	{
		if ( price < 0)
		{
			price = 0;
		
		}
		else
		{
			price = newPrice;
		}
		
	}
// price and quantity if statements
	
}//end class Invoice

