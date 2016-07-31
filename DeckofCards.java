package ObjectManipulation;
import java.util.*;

/*
 * design a test driver that shows that your deckofcards.java class works correctly. create a report that documents your design decisions, lists
 * your interface class and driver code and shows the results of using the driver and discribes your experiance with this project like what
 * went well as well as what went wrong
 */
public class DeckofCards implements DeckofCardsInterface {

	private ArrayList<Card> deck = new ArrayList<Card>();
	private Card card;
	private long seed = System.nanoTime();
			
	public DeckofCards(){		
		for (int i = 1; i <= 13; i++){
			for(int j = 1; j <= 4; j++){
				deck.add(new Card(i,j));
				}		
		}	
	}
	@Override
	public void shuffle() {
		Collections.shuffle(deck , new Random(seed));
		}


	@Override
	public int cardsLeft() {
		return deck.size();
	}


	@Override
	public Card dealCard() {
		if(deck.size() < 1){
			for (int i = 1; i <= 13; i++){
				for(int j = 1; j <= 4; j++){
					deck.add(new Card(i,j));
				}
			}
			shuffle();
			
			}
		card = deck.get(0);
		deck.remove(0);
		return card;
	}

	private String displayDeck(){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < deck.size(); i++){
			sb.append(deck.get(i) + "\n");
		
		}
		return sb.toString();
	}
		
	public String toString(){
		return displayDeck();
	}
		
}



