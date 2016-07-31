package ObjectManipulation;

public class SportsStatistics {

	private int numPlayers;
	private String sportName;
	private String teamName;

	
	
	public SportsStatistics(int numPlayers,String sportName,
			String teamName){
		
		setNumPlayers(numPlayers);
		setSportsName(sportName);
		setTeamName(teamName);
		
	
	}
	
	public int getNumPlayers(){
		return numPlayers;
	}
	
	public String getSportName(){
		return sportName;
	}
	
	public String getTeamName(){
		return teamName;
	}
	
		
	public void setNumPlayers(int numPlayers){
		this.numPlayers = numPlayers;
	}
	
	public void setSportsName(String sportName){
		this.sportName = sportName;
	}

	public void setTeamName(String teamName){
		this.teamName = teamName;
		
	}
	
		
	public String toString(){		
		StringBuilder sb = new StringBuilder();
		sb.append("Sport: " + sportName);
		sb.append("\n" + "Number Of players: " + numPlayers + "\n" + "Team Name: "+ teamName);
			return sb.toString();
	}
}
