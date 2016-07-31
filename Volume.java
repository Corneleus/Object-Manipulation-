package ObjectManipulation;

public class Volume 
{
	private String volumeName;
	private int numberOfBooks;
	
	Book [] theBook = new Book[5];
  
	public String toString()
	{
		
		return(volumeName + " " + numberOfBooks);
		
	}
	
	public Volume(String volumeName, int numberOfBooks)
	{
		this.numberOfBooks = numberOfBooks;
		this.volumeName = volumeName;
		
	}
	
	public String getBookArray()
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < theBook.length; i++)
		{
		
			sb.append(theBook[i].toString()+ "\n");
			
		}
		return sb.toString();
	
	}
	
	
}
