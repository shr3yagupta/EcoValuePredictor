public class ValueCalculator {

    public static double calculateValue(String wasteType, int quantityKg, String userLocation) {

        double rate = 0;

        if (wasteType.equalsIgnoreCase("plastic")) {
            rate = userLocation.equalsIgnoreCase("urban") ? 22 : 16;
        } 
        else if (wasteType.equalsIgnoreCase("paper")) {
            rate = userLocation.equalsIgnoreCase("urban") ? 12 : 9;
        } 
        else if (wasteType.equalsIgnoreCase("metal")) {
            rate = userLocation.equalsIgnoreCase("urban") ? 32 : 26;
        } 
        else {
            System.out.println("Unknown waste type, using default value.");
            rate = 5;
        }

        return rate * quantityKg;
    }
}