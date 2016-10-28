import com.rc.cards.Card;
import com.rc.cards.Deck;

public class NewCardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck deck = new Deck();
		deck.shuffle(1000);
		
		deck.display();
		
		Card card = deck.getNextCard();
		System.out.println(card);
		
		deck.getNextCard();
		System.out.println(card);

	}

}
