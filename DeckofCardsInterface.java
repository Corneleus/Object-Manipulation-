package ObjectManipulation;
// design a deck of cards class that represents a typical deck of 52 playing cards using a private array of card.
// the constructor of the class should initialize the hidden array to contain the standard deck of cards.
// the class should implement the following interface

public interface DeckofCardsInterface {

	
	public void shuffle();
	public int cardsLeft();
	public Card dealCard();	
	public String toString();
	

}
