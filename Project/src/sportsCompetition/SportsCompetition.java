package sportsCompetition;

import events.Event;

public class SportsCompetition extends Event {
 
	// Attributes
		protected int numOfActivity;
		SeasonName season;

		// Default Constructor
		public SportsCompetition() {
			super();
			this.numOfActivity = 0;
		}

		// Parametized Constructor
		public SportsCompetition(int year, int month, int numOfCities, int numOfActivity, SeasonName season) {
			super(year, month, numOfCities);
			this.numOfActivity = numOfActivity;
			this.season = season;
		}

		// Copy Constructor
		public SportsCompetition(SportsCompetition sc) {
			super(sc);
			this.numOfActivity = sc.numOfActivity;
			this.season = sc.season;
		}

		// Getters and Setters
		public int getNumOfActivity() {
			return numOfActivity;
		}

		public void setNumOfActivity(int numOfActivity) {
			this.numOfActivity = numOfActivity;
		}

		public SeasonName getSeason() {
			return season;
		}

		public void setSeason(SeasonName season) {
			this.season = season;
		}

		// toString method
		public String toString() {
			return "This " + this.season + " of sportscompetition will consist of " + this.numOfActivity
					+ " number of activities " + " and will be held in " + this.year + ", " + this.month + " in "
					+ this.numOfCities + " cities.";
		}

		// eqauals method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			SportsCompetition other = (SportsCompetition) obj;
			if (numOfActivity != other.numOfActivity)
				return false;
			if (season != other.season)
				return false;
			return true;
		}

	}


