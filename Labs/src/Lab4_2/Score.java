package Lab4_2;



public class Score 
{
		private String name;
		private int scores;
		public Score(String name, int scores)
		{
			this.name =  name;
			this.scores = scores;
		}
		
		public String getName()
		{
			return this.name;
		}
		public int getScore()
		{
			return this.scores;
		}
		public String toString()
		{
			return name + " " + scores;
		}

}

