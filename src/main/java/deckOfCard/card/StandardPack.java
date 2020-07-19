package deckOfCard.card;

import java.util.ArrayList;
import java.util.List;

public class StandardPack  extends Pack{

	public StandardPack() {
		super.setCards(build());
	}
	@Override
	protected List build() {
		List<StandardCard> cards = new ArrayList<>();
		
		for(StandardSuit suit:StandardSuit.values()) {
		
			for(int rank=StandardCard.getMinValue();rank<=StandardCard.getMaxValue();rank++) {
				cards.add(new StandardCard(suit, rank));
			}
		}
		
		return cards;
	}

	
}
