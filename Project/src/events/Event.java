package events;

public class Event {
	// Attributes
		protected int year;
		protected int month;
		protected int numOfCities;

		// Default Constructor
		public Event() {
			this.year = 0000;
			this.month = 00;
			this.numOfCities = 0;
		}

		// Parametized Constructor
		public Event(int year, int month, int numOfCities) {
			super();
			this.year = year;
			this.month = month;
			this.numOfCities = numOfCities;
		}

		// Copy Constructor
		public Event(Event e) {
			this.year = e.year;
			this.month = e.month;
			this.numOfCities = e.numOfCities;
		}

		// Getters and Setters
		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getNumOfCities() {
			return numOfCities;
		}

		public void setNumOfCities(int numOfCities) {
			this.numOfCities = numOfCities;
		}

		// toString method
		public String toString() {
			return "This Event will be held in " + this.year + ", " + this.month + " in " + this.numOfCities + " cities.";
		}

		// Equals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Event other = (Event) obj;
			if (month != other.month)
				return false;
			if (numOfCities != other.numOfCities)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

	}

