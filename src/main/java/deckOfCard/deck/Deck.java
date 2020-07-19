package deckOfCard.deck;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import deckOfCard.card.Card;
import deckOfCard.card.Pack;

public class Deck<T extends Card> implements Iterable<T> {

	private final List<T> cards;
	
	public Deck(Pack pack) {
		this.cards = pack.getCards();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public List<T> dealHand(int numberOfCards){
		//code for dealing hand
		return null;
	}
	
	public T dealCard() {
		//code for dealing a card
		return null;
	}
	
	public int remainingCards() {
		return cards.size();
	}
	
	public void removeCards(List<T> cards) {
		//code for remove the cards
	}
	
	@Override
	public Iterator<T> iterator() {
	 
		return null;
	}

	
}
