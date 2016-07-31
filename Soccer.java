package ObjectManipulation;
public class Soccer extends SportsStatistics {
	
		private int playerInjuriesFaked;
		
		public Soccer(int numPlayers,String sportName,
				String teamName, int playerInjuriesFaked){
			
			super(numPlayers, sportName, teamName);
			setPlayersInjuriesFaked(playerInjuriesFaked);
			
		}
		
		public int getPlayerInjuriesFaked(){
			return playerInjuriesFaked;
		}

		public void setPlayersInjuriesFaked(int playerInjuriesFaked){
			this.playerInjuriesFaked = playerInjuriesFaked;			
		}

		public String toString(){
			return "# of Players injuries that were faked: " +
		playerInjuriesFaked + "\n" + super.toString();
		}

}
