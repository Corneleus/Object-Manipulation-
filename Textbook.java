package ObjectManipulation;

public class Textbook extends ReadingMaterial 
{
	private String subject;
	public Textbook(String title, String author, int pages, String subject) 
	{
		super(title, author, pages);
		setSubject(subject);
	}
	
	public String getSubject() 
	{
		return subject;
	}
	
	public void setSubject(String subject) 
	{
		this.subject = subject;
	}
	
	public String toString() {
		return "Subject: " + subject + "\n" + super.toString();
	}
}
