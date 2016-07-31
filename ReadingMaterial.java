package ObjectManipulation;


public class ReadingMaterial 
{
	private String title, author;
	private int numPages;
	
	public ReadingMaterial(String title, String author, int pages) 
	{
		setTitle(title);
		setAuthor(author);
		setNumPages(pages);
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public int getNumPages() 
	{
		return numPages;
	}
	
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public void setNumPages(int pages) 
	{
		numPages = pages;
	}
	
	
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\"" + title + "\"");
		sb.append(" " + author);
		sb.append("\n" + "Pages: " + numPages);
		return sb.toString();
	}
}
