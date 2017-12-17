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
				
			unDealt.add(new Card(rank[r],suit[s],pointValue[r]));
					
				
			}
		}
		
	}
	public boolean isEmpty()
	{
		return(unDealt.size()==0);
	}
	public int size()
	{
		return unDealt.size();
	}
	public Card deal()
	{
		if(unDealt.isEmpty())
		{
			return null;
		}
		Card temp = unDealt.get(0);
		unDealt.remove(0);
		Dealt.add(temp);
		return temp;
		
	}
	public void shuffle()
	{
		for(int x = Dealt.size()-1; x > 0; x--)
		{
			int r= (int)(Math.random()* (x+1));
			Card temp = Dealt.get(x);
			Card otherTemp = Dealt.get(r);
			Dealt.remove(x);
			Dealt.add(x, otherTemp);
			Dealt.remove(r);
			Dealt.add(r, temp);
		}
		for(int x = 0; x < Dealt.size()-1;x++)
		{
			Card temp = Dealt.get(0);
			Dealt.remove(0);
			unDealt.add(temp);
		}
	}
}


