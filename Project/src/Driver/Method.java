package Driver;
import events.Event;

public class Method {
	// Two attributes
		int index; 
		int least;
		int most;
		
		// Figures out the Event happening in the least number of cities.
		public void leastNumOfCities(Event[] e) { 
			
			// Initial least is the first Event.
			least = e[0].getNumOfCities();
			
			// Compare each Event to find the Event with list number of cities.
			for(int i = 0; i < e.length; i++) { 
				if(least > e[i].getNumOfCities()) {
					index = i;
					least = e[i].getNumOfCities();
				}
			}
			
			// Display the event with least number of cities along with the index.
			System.out.print("The Event happening in least number of cities is in location: ");
			System.out.println(index);
			System.out.println("The full information of that Event are as follows: ");
			System.out.println(e[index].toString());
			
		}
		
		// Figures out the Event happening in the most number of cities.
		public void mostNumOfCities(Event[] e) { 
			
			// Initial least is the first Event.
			least = e[0].getNumOfCities();
			
			// Compare each Event to find the Event with list number of cities.
			for(int i = 0; i < e.length; i++) { 
				if(least < e[i].getNumOfCities()) {
					index = i;
					most = e[i].getNumOfCities();
				}
			}
			
			// Display the event with least number of cities along with the index.
			System.out.print("The Event happening in most number of cities is in location: ");
			System.out.println(index);
			System.out.println("The full information of that Event are as follows: ");
			System.out.println(e[index].toString());
			
		}
		
		// Event happening in the same year
		public void sameYear(Event[] e, int year) { 
			
			for(int i = 0; i < e.length; i++) { 
				index = i;
				
				if(e[i].getYear() == year) { 
					System.out.print("The Event happening in year " + year + "  is in location: ");
					System.out.println(index);
					System.out.println("The full information of that Event are as follows: ");
					System.out.println(e[index].toString());
					System.out.println("");
				}
			}
			
		}
		


	}


