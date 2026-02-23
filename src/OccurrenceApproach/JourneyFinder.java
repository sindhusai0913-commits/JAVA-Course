package OccurrenceApproach;

import java.util.HashMap;
import java.util.Map;

public class JourneyFinder {
    public static void main(String[] args) {

        // Step 1: Create a list of routes (source -> destination)
        String[][] routes = {
                {"Vizag", "Hyderabad"},
                {"Hyderabad", "Bangalore"},
                {"Bangalore", "Ooty"},
                {"Ooty", "Kerala"}
        };

        // Step 2: Map to store occurrence count of each city
         Map<String, Integer> countMap = new HashMap<>();

        // Step 3: Count occurrences of each city
        for (String[] route : routes) {

            String source = route[0];
            String destination = route[1];

            // Increase count of source
            countMap.put(source, countMap.getOrDefault(source, 0) + 1);

            // Increase count of destination
            countMap.put(destination, countMap.getOrDefault(destination, 0) + 1);
        }

        // Step 4: Identify start and end points
        String start = "";
        String end = "";

        for (String[] route : routes) {

            String source = route[0];
            String destination = route[1];

            // Start: appears once and appears as source
            if (countMap.get(source) == 1) {
                start = source;
            }

            // End: appears once and appears as destination
            if (countMap.get(destination) == 1) {
                end = destination;
            }
        }

        // Step 5: Print result
        System.out.println("Starting Point: " + start);
        System.out.println("Destination Point: " + end);
    }

}
