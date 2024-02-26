package BE_week_6;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	//constructor
	public Deck ()
	{
		String[] cardSuits = new String[] {"Clubs", "Spades", "Diamonds", "Hearts"};
		int[] cardValues = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
		String[]cardFaces = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
		for (int i =0 ; i < cardSuits.length; i++)
		{
			for (int j = 0; j < cardValues.length; j++)
			{
				Card currentCard = new Card(cardSuits[i], cardValues[j], cardFaces[j]);
				this.cards.add(currentCard);
			}
		}
	}
	
	public void shuffle() {
		 Collections.shuffle(this.cards); 
	}
	
	public void deal(Player player1, Player player2) {
		for (int i =0; i < this.cards.size(); i++)
		{
			if (i%2 !=0)//if odd turn deal card to player 1
			{
				player1.playerDeck.add(this.cards.get(i));
			}
			else //if even turn deal card to player2
			{
				player2.playerDeck.add(this.cards.get(i));
			}
		}
	}
	


}
