package ObjectManipulation;
public class Novel extends ReadingMaterial
{
	private String genre;
	private int primaryCharacters;
	
	public Novel(String title, String author, int pages, int characters,
				String genre) 
	{
		super(title, author, pages);
		setGenre(genre);
		setPrimaryCharacters(characters);
	}
	
	public String getGenre() 
	{
		return genre;
	}
	
	public int getPrimaryCharacters() 
	{
		return primaryCharacters;
	}
	
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
	
	public void setPrimaryCharacters(int characters) 
	{
		primaryCharacters = characters;
	}
	public String toString() {
		return "Genre: " + genre + "\n" + super.toString();
	}
}
