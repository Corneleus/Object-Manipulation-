package ObjectManipulation;

public class DeckTest {

	public static void main(String [] args){

		DeckofCards d = new DeckofCards();
		
		d.shuffle();
		System.out.println("Deck");
		System.out.print(d.toString());
		System.out.println("Card Delt");
		System.out.println(d.dealCard());
		System.out.println("Number of Cards Left " + d.cardsLeft());
		System.out.println("Card Delt");
		System.out.println(d.dealCard());
		System.out.println("Number of Cards Left " + d.cardsLeft());
		System.out.println(d.cardsLeft());
		
		for (int i = 0; i < 53; i++){
			System.out.println("Card Delt");
			System.out.println(d.dealCard());
			System.out.println("Number of Cards Left " + d.cardsLeft());
		}	
		
	}
		

		
		
}

