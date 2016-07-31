package ObjectManipulation;

public class CoursesTest {

	
	public static void main(String [] args){
	
		Csc201 csc = new Csc201("Computer Science", "Learning how to use Objects", "Science",
				201, true, 15.98);
		
		Mth174 mth = new Mth174("Calculus 2", "Calc Using 3d objects", "Math", 174,
				"Math 173", "Ti-83 or better");
	
		Bio101 bio = new Bio101("Biology", "Study of live Intro", "Science", 101, 319);
	
		System.out.println(csc.toString() + "\n");
		System.out.println(mth.toString() + "\n");
		System.out.println(bio.toString() + "\n");
		
	
	
	}
}
