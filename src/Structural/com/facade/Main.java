package Structural.com.facade;

import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		TravelFacade travelFacade = new TravelFacade();
		List<TravelRoute> travelRoutes = 
				travelFacade.getTravelRoutes(new Date(), new Date());
		
		if (travelRoutes != null && travelRoutes.size() > 0) {
			travelFacade.bookTravelRoute(travelRoutes.get(0));
		}
		
	}
}