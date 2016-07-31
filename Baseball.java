package ObjectManipulation;
public class Baseball extends SportsStatistics {

	private int homeRuns;
	private int noHitters;
	
	public Baseball(int numPlayers, String sportName, String teamName, int homeRuns,
			int noHitters){
		
		super(numPlayers, sportName, teamName);
		setHomeRuns(homeRuns);
		setNoHitters(noHitters);
		
	}
	
	public int getHomeRuns(){
		return homeRuns;
	}
	
	public int getNoHitters(){
		return noHitters;
	}
	
	public void setHomeRuns(int homeRuns){
		this.homeRuns = homeRuns;
	}
	
	public void setNoHitters(int noHitters){
		this.noHitters = noHitters;
	}
	
	public String toString(){
		return "# of No-hitters: " + noHitters + 
				"\n" + "# of Home Runs: " + homeRuns + "\n" + super.toString();
	}
	
}
