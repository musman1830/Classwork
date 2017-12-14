package lab4;

public class Card {
	String rank;
	String suit;
	int pointValue;
	
	public Card(String rank, String suit, int pointValue)
	{
		this.pointValue= pointValue;
		this.rank = rank;
		this.suit= suit;
	}
	public boolean equals(Card otherCard)
	{
		
		if((pointValue == otherCard.pointValue)&&(rank==otherCard.rank)&&(suit==otherCard.suit))
		{
		return true;
		}
		return false;
	}
	public String toString()
	{
		return "Rank:" + rank +"Suit:" + suit + "PointValue" + pointValue;
	}
	
}
