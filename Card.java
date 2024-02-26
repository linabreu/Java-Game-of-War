package BE_week_6;

public class Card {
	private int value;
	private String suit;
	private String faceValue;
	
	//constructor
	public Card (String suit, int value, String faceValue)
	{
		this.suit = suit;
		this.value = value;
		this.faceValue = faceValue;
	}
	
	//getters
	public int getValue() {return this.value;}
	public String getSuit() {return this.suit;}
	public String faceValue() {return this.faceValue;}
	
	//setters
	public void setValue (int newValue)
	{
		this.value = newValue;
	}
	public void setSuit (String newSuit)
	{
		this.suit = newSuit;
	}
	public void setFaceValue (String newFaceValue)
	{
		this.faceValue = newFaceValue;
	}
	
	public String toString()
	{
		return "the " + this.faceValue + " of " + this.suit + " worth " + this.value;
				
	}

}
