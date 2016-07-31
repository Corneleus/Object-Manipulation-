package ObjectManipulation;

public class ReadingMaterialTest 
{
	public static void main(String[] args) 
	{
		Book book = new Book("Hitchhiker's Guide to The Galaxy", "Douglas Adams",
							 1000);
		Textbook text = new Textbook("Calculus", "Dude Broski, Bro Dudeski, Ski Brodude",
				1247, "Mathematics");
		Magazine mag = new Magazine("Hollywood", "Green Thumbs", 25);
		Novel nov = new Novel("The Lord of the Rings", "J. R. R. Tolkien", 2048, 13, "Fantasy");
		
		System.out.println(book.toString() + "\n");
		System.out.println(text.toString() + "\n");
		System.out.println(mag.toString() + "\n");
		System.out.println(nov.toString() + "\n");
	}
}
