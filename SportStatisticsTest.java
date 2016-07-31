package ObjectManipulation;

public class SportStatisticsTest {

	public static void main(String [] args){
		
		Football foot = new Football(11, "Foot Ball", "KC Cheifs", 1 , 15);
		
		Baseball base = new Baseball(9, "BaseBall", "KC Royals", 50, 6);
	
		Soccer soc = new Soccer(11, "Soccer or Fut Bol", "Bangles", 52);
		
		Dodgeball dod = new Dodgeball(8, "Dodgeball", "Average Joes");
	
		
		System.out.println(foot.toString() + "\n");
		System.out.println(base.toString() + "\n");
		System.out.println(soc.toString() + "\n");
		System.out.println(dod.toString() + "\n");
		
	}
	
	
}
