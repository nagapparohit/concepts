package deckOfCard;

import org.junit.Test;

import deckOfCard.card.Card;
import deckOfCard.card.Pack;
import deckOfCard.card.StandardCard;
import deckOfCard.card.StandardPack;
import deckOfCard.card.StandardSuit;
import deckOfCard.deck.Deck;

public class TestingDeck {

	@Test
	public void demo() {
		// create a single classical card
        Card sevenHeart = new StandardCard(StandardSuit.HEARTS, 7);              

        // create a complete deck of standard cards      
        Pack cp = new StandardPack();                   
        Deck deck = new Deck(cp);
        
        System.out.println("Remaining cards: " + deck.remainingCards());
        
	}
}

