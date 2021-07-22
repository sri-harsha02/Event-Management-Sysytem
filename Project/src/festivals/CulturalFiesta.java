package festivals;

public class CulturalFiesta extends Festival{

	// Attributes
		private int numOfSpokenLang;

		// Default Constructor
		public CulturalFiesta() {
			super();
			this.numOfSpokenLang = 0;
		}

		// Parametized Constructor
		public CulturalFiesta(int year, int month, int numOfCities,String name, double price, int duration, int numOfSpokenLang) {
			super(year, month, numOfCities,name, price, duration);
			this.numOfSpokenLang = numOfSpokenLang;
		}

		// Copy Constructor
		public CulturalFiesta(CulturalFiesta cf) {
			super(cf);
			this.numOfSpokenLang = cf.numOfSpokenLang;
		}

		// Getters and Setters
		public int getNumOfSpokenLang() {
			return numOfSpokenLang;
		}

		public void setNumOfSpokenLang(int numOfSpokenLang) {
			this.numOfSpokenLang = numOfSpokenLang;
		}

		// toString method
		public String toString() {
			return "This " + this.name + " Festival will be held in " + this.year + ", " + this.month + " in "
					+ this.numOfCities + " cities, for " + this.duration + " days " + " the tickets will cost " + this.price
					+ "$, and has " + this.numOfSpokenLang + " spoken languages.";
		}

		// equals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			CulturalFiesta other = (CulturalFiesta) obj;
			if (numOfSpokenLang != other.numOfSpokenLang)
				return false;
			return true;
		}

	}

