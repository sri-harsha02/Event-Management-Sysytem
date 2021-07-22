package festivals;

public class MusicFiesta extends Festival{

	// Attributes
		private int numOfBands;

		// Default Constructor
		public MusicFiesta() {
			super();
			this.numOfBands = 0;
		}

		// Parametized Constructor
		public MusicFiesta(int year, int month, int numOfCities,String name, double price, int duration, int numOfBands) {
			super(year, month, numOfCities, name, price, duration);
			this.numOfBands = numOfBands;
		}

		// Copy Constructor
		public MusicFiesta(MusicFiesta mf) {
			this.numOfBands = mf.numOfBands;
		}

		// Getters and Setters
		public int getNumOfBands() {
			return numOfBands;
		}

		public void setNumOfBands(int numOfBands) {
			this.numOfBands = numOfBands;
		}

		// toString method
		public String toString() {
			return "This Music Festival consisting of " + this.numOfBands + " will be held in " + this.year + ", "
					+ this.month + " in " + this.numOfCities + ", for " + this.duration + " days "
					+ " the tickets will cost " + this.price + "$.";
		}

		// equals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			MusicFiesta other = (MusicFiesta) obj;
			if (numOfBands != other.numOfBands)
				return false;
			return true;
		}
	}
