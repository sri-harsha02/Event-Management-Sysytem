package Driver;

import events.Event;
import fair.Fair;
import fair.FairType;
import festivals.CulturalFiesta;
import festivals.Festival;
import festivals.MusicFiesta;
import sportsCompetition.SeasonName;
import sportsCompetition.SportsCompetition;

public class Driver {
	

	// Copy Festival method
	public static void copyFestival(Event[] e) {

		// Creating a new event array
		Event[] copyEvent = new Event[e.length];

		// Copying the passed array to the new array using copy constructor
		for (int i = 0; i < e.length; i++) {

			switch (e[i].getClass().getName()) {

			case "events.Event":
				copyEvent[i] = new Event(e[i]);
				break;

			case "fair.Fair":
				copyEvent[i] = new Fair((Fair) e[i]);
				break;

			case "festivals.CulturalFiesta":
				copyEvent[i] = new CulturalFiesta((CulturalFiesta) e[i]);
				break;

			case "festivals.Festival":
				copyEvent[i] = new Festival((Festival) e[i]);
				break;

			case "festivals.MusicFiesta":
				copyEvent[i] = new MusicFiesta((MusicFiesta) e[i]);
				break;

			case "sportsCompetition.SportsCompetition":
				copyEvent[i] = new SportsCompetition((SportsCompetition) e[i]);
				break;

			}
		}
		
		Driver.printEvent(e, copyEvent);

	
}


//Print method for printing the original and copied Event[]
	public static void printEvent(Event[] event, Event[] copyEvent) {

		// Displaying the original event array
		System.out.println("Displaying the original event...");

		for (int i = 0; i < event.length; i++) {
			System.out.println(event[i].toString());
		}

		System.out.println();
		
		// Displaying the copy event array
		System.out.println("Displaying the copied event...");

		for (int i = 0; i < copyEvent.length; i++) {
			System.out.println(copyEvent[i].toString());
		}

	}

	public static void main(String[] args) {

		// Array
		Event[] event = new Event[10];

		// Enums
		FairType type = FairType.career;
		FairType type2 = FairType.science;
		SeasonName sName = SeasonName.fall;
		SeasonName sName2 = SeasonName.winter;

		// Objects
		Method m = new Method();
		Event e = new Event(2029, 7, 2);
		Fair f = new Fair(2039, 8, 1, 6, type);
		Fair f2 = new Fair(2020, 9, 9, 7, type2);
		CulturalFiesta cf = new CulturalFiesta(2020, 3, 4, "CulturalFestival_1", 29.99, 3, 2);
		CulturalFiesta cf2 = new CulturalFiesta(2022, 2, 6, "CulturalFestival_2", 39.99, 6, 1);
		CulturalFiesta cf3 = null;
		CulturalFiesta cf4 = new CulturalFiesta(2022, 3, 4, "CulturalFestival_4", 29.99, 3, 2);
		Festival fv = new Festival(2019, 2, 8, "Festival_1", 39.99, 5);
		MusicFiesta mf = new MusicFiesta(2025, 3, 9, "MusicFestival_1", 49.99, 9, 4);
		SportsCompetition sc = new SportsCompetition(2025, 7, 7, 5, sName);
		SportsCompetition sc2 = new SportsCompetition(2027, 7, 8, 6, sName2);

		/*** Part-I ***/
		// 1) Testing the toString methods
		System.out.println("1) Testing toString methods...");
		System.out.println();
		System.out.println(e.toString());
		System.out.println();
		System.out.println(f.toString());
		System.out.println();
		System.out.println(cf.toString());
		System.out.println();
		System.out.println(fv.toString());
		System.out.println();
		System.out.println(mf.toString());
		System.out.println();
		System.out.println(sc.toString());
		System.out.println("");

		// 2) Testing the equals methods
		System.out.println("2) Testing equals method...");
		System.out.println();
		// Case-1 (Different Objects)
		System.out.print("Festival and Fair (Different Objects): ");
		System.out.println(f.equals(fv));
		System.out.println();
		// Case-2 (Objects with different values)
		System.out.print("CulturalFiesta_1 and CulturalFiesta_2 (Objects with different values): ");
		System.out.println(cf.equals(cf2));
		System.out.println();
		// Case-3 (Null Object)
		System.out.print("CulturalFiesta_1 and Culturalfiesta_3 (Null Object): ");
		System.out.println(cf.equals(cf3));
		System.out.println("");
		// Case-4 (Objects with same values)
		System.out.print("CulturalFiesta_2 and CulturalFiesta_4 (Objects with same values): ");
		System.out.println(cf2.equals(cf4));
		System.out.println("");

		// Filling the array of Event with different objects
		event[0] = e;
		event[1] = f;
		event[2] = f2;
		event[3] = cf;
		event[4] = cf2;
		event[5] = cf4;
		event[6] = fv;
		event[7] = mf;
		event[8] = sc;
		event[9] = sc2;

		// 3) Testing the least/most number of cities
		System.out.println("3) a. Testing the least number of cities... ");
		m.leastNumOfCities(event);
		System.out.println();

		System.out.println("3) b. Testing the most number of cities... ");
		m.mostNumOfCities(event);
		System.out.println();

		// 4) Testing the sameYear method
		System.out.println("4) Testing the least number of cities... ");
		m.sameYear(event, 2025);
		System.out.println();

		/** Part-II **/
		// 5) Displaying the event array along with the copied array
		System.out.println("5) Testing the copy festival method... ");
		Driver.copyFestival(event);

	}

}

