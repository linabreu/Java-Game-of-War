package BE_week_6;

import java.util.ArrayList;

public class Player {
	
	private String name; //should be private
	public ArrayList<Card> playerDeck = new ArrayList<Card>();
	private int score = 0;
	
	//constructor
	public Player (String name)
	{
		this.name = name;
	}
	//getters
	public String getName() {return this.name;}
	public int getScore() {return this.score;}
	
	//setters
	public void setName(String newName)
	{
		this.name = newName;
	}
	public void setScore(int newScore) 
	{
		this.score = newScore;
	}
	//class methods
	public Card playACard()
	{
		Card cardToPlay = this.playerDeck.remove(0);
		return cardToPlay;//playing a card means pulling it off the top of the deck
	}

}
