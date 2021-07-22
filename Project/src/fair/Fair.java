package fair;
import events.Event;
public class Fair extends Event {
	// Attributes
		private int numOfExibitors;
		private FairType type;

		// Default Constructor
		public Fair() {
			super();
			this.numOfExibitors = 0;
		}

		// Parametized Constructor
		public Fair(int year, int month, int numOfCities, int numOfExibitors, FairType type) {
			super(year, month, numOfCities);
			this.numOfExibitors = numOfExibitors;
			this.type = type;

		}

		// Copy Constructor
		public Fair(Fair e) {
			super(e);
			this.numOfExibitors = e.numOfExibitors;
			this.type = e.type;
		}

		// Getters and Setters
		public int getNumOfExibitors() {
			return numOfExibitors;
		}

		public void setNumOfExibitors(int numOfExibitors) {
			this.numOfExibitors = numOfExibitors;
		}

		public FairType getType() {
			return type;
		}

		public void setType(FairType type) {
			this.type = type;
		}

		// toString method
		public String toString() {
			return "The " + this.type + " Fair consisting of " + this.numOfExibitors + "  will be held in " + this.year
					+ ", " + this.month + " in " + numOfCities + " cities.";
		}

		// equals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Fair other = (Fair) obj;
			if (numOfExibitors != other.numOfExibitors)
				return false;
			if (type != other.type)
				return false;
			return true;
		}

	}
