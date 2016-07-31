package ObjectManipulation;
public class Book 
{
	private String title;
	private String author;
	private int numberOfPages;
	
	public String toString()
	{
		return (title + " " + author + " " + numberOfPages);
	}
	
	public Book(String title , String author, int numberOfPages)
	{
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		
	}
	
	
	
}

