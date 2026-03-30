import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("♻️ Eco Value Predictor");

        // taking input
        System.out.print("Enter waste type: ");
        String wasteType = input.nextLine();

        System.out.print("Enter quantity (kg): ");
        int quantityKg = input.nextInt();
        input.nextLine();

        System.out.print("Enter location (urban/rural): ");
        String userLocation = input.nextLine();

        // calling other classes
        double result = ValueCalculator.calculateValue(wasteType, quantityKg, userLocation);
        String tip = ReuseAdvisor.getSuggestion(wasteType);

        // output
        System.out.println("\nEstimated Value: ₹" + result);
        System.out.println("Reuse Idea: " + tip);

        // extra feature (important)
        if (quantityKg > 10) {
            System.out.println("Bonus: You may get extra price for bulk waste!");
        }

        System.out.println("Thank you for recycling 🌱");
    }
}