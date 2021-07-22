package festivals;

import events.Event;

public class Festival extends Event {
	
	// Attributes
		protected String name;
		protected double price;
		protected int duration;

		// Default Constructor
		public Festival() {
			this.name = null;
			this.price = 0.0;
			this.duration = 0;
		}

		// Parametized Constructor
		public Festival(int year, int month, int numOfCities,String name, double price, int duration) {
			super();
			this.year = year;
			this.month = month;
			this.numOfCities = numOfCities;
			this.name = name;
			this.price = price;
			this.duration = duration;
		}

		// Copy Constructor
		public Festival(Festival f) {
			super(f);
			this.name = f.name;
			this.price = f.price;
			this.duration = f.duration;
		
		}

		// Getters and Setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		// toString method
		public String toString() {
			return "This " + this.name + " Festival will be held in " + this.year + ", " + this.month + " in "
					+ this.numOfCities + ", for " + this.duration + " days " + " the tickets will cost " + this.price
					+ "$.";
		}

		// equals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Festival other = (Festival) obj;
			if (duration != other.duration)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			return true;
		}

	}

