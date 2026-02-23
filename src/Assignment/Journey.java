import java.util.HashMap;
import java.util.Map;

public class Journey {


    public static String findStartingPoint(Map<String, String> Cities) {

        searchloop:
        for (String startCity : Cities.keySet()) {

            for (String destinationCity : Cities.values()) {
                if (destinationCity.equals(startCity)) {
                    continue searchloop;

                }
            }

            return startCity;
        }
        return null;
    }

    public static String findDestinationPoint(Map<String, String> Cities, String startPoint) {
        if (startPoint == null ) {
            return null;
        }

        String currentCity = startPoint;
        String nextCity = Cities.get(currentCity); // starting city

        // Trace the journey until the next city is not found in the map
        while (nextCity != null) {
            currentCity = nextCity; // starting city
            nextCity = Cities.get(currentCity);
        }

        // The last 'currentCity' before 'nextCity' became null is the final destination.
        return currentCity;
    }

    public static void main(String[] args) {

        Map<String, String> City = new HashMap<>();
        City.put("Vizag", "Hyderabad");
        City.put("Hyderabad", "Bangalore");
        City.put("Bangalore", "Ooty");
        City.put("Ooty", "Kerala");

        // 2. Find the Starting Point
        String startingPoint = findStartingPoint(City);

        // 3. Find the Destination Point
        String destinationPoint = findDestinationPoint(City, startingPoint);


        System.out.println("Cities: " + City);


        if (startingPoint != null && destinationPoint != null) {
            System.out.println(" Starting Point: " + startingPoint);
            System.out.println(" Final Destination Point: " + destinationPoint);
        } else {
            System.out.println(" Error ");
        }


    }
}
