public class Square extends Rectangle 
	{

		int side;

		public Square(int side) {
			super(side, side);
			this.side = side;
		}

		
		public String toString() {
			
			return "Square length: " + side + "Width: " + side + " Area: " + this.area() + " Perimeter: "
					+ this.perimeter();
		}

	}


