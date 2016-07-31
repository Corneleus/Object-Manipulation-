package ObjectManipulation;
public class Football extends SportsStatistics {
	
	private int superBowlsAttended;
	private int superBowlsWon;
	private int superBowlsLost;
	private int playOffs;
	
	public Football(int numPlayers, String sportName, String teamName, 
			int superBowls, int playOffs){
		
		super(numPlayers, sportName, teamName);
		setSuperBowlsWon(superBowlsWon);
		setPlayOffs(playOffs);
		
		
	}

	public int getSuperBowlsWon(){
		return superBowlsWon;
	}
	
	public int getPlayOffs(){
		return playOffs;
	}
	
	
	public void setSuperBowlsWon(int superBowlsWon){
		this.superBowlsWon = superBowlsWon;
	}
	
	
	public void setPlayOffs(int playOffs){
		this.playOffs = playOffs;
	}

	public String toString(){
		return "# of Super Bowls Won: " + superBowlsWon + 
				"\n" + "# of Play offs: " + playOffs + "\n" + super.toString();
	}


}
