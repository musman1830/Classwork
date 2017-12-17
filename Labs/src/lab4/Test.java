package lab4;

public class Test {
	public static class Runner {

		public static void main(String[] args) {
			String[] ranks = new String[] { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack","Queen","King" };
			String[] suits = new String[] { "Hearts", "Spades", "Diamond", "Clubs" };
			int[] pointValues = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
			Deck deck = new Deck(ranks, suits, pointValues);
			deck.shuffle();
			for (int i = 0; i < deck.size(); i++) {
				Card current = deck.deal();
				i--;
				System.out.println(current);
			}
		}
	}
}
