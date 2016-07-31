package ObjectManipulation;

public class Card {

	private int rank;
	private int suit;
	private String [] suitArray = {"Clubs","Diamonds","Hearts","Spades"};
	private String [] rankArray = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	
	public Card(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
		}
	
	public int getRank(){
		
		return rank;
	}
	
	public int getSuit(){
		
		return suit;		
	}
	
	public void setRank(int rank){
		this.rank = rank;
	}
	
	public void setSuit(int suit){
		this.suit = suit;
	}
	
	public String toString(){
		
		return  (rankArray[rank-1] + " of " + suitArray[suit-1]);
	}
	
}
