public class ReuseAdvisor {

    public static String getSuggestion(String wasteType) {

        if (wasteType.equalsIgnoreCase("plastic")) {
            return "You can make bottles, planters or eco-bricks.";
        } 
        else if (wasteType.equalsIgnoreCase("paper")) {
            return "Use it for making recycled notebooks.";
        } 
        else if (wasteType.equalsIgnoreCase("metal")) {
            return "Can be reused in small tools or art.";
        }

        return "Try to recycle responsibly.";
    }
}