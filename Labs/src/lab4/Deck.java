package lab4;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	private List<Card> unDealt = new ArrayList<Card>();
	private List<Card> Dealt = new ArrayList<Card>();
	public Deck(String[]rank, String[]suit, int[]pointValue)
	{
		for(int r=0;r< rank.length; r++)
		{
			for(int s=0;s< suit.length;s++)
			{
				for(int p=0;p<pointValue.length;p++)
				{
					unDealt.add(new Card(rank[r],suit[s],pointValue[p]));
					
				}
			}
		}
		
	}
	public boolean isEmpty()
	{
		if(Deck.length>0)
		{
			return true;
		}
		return false;
	}

}
