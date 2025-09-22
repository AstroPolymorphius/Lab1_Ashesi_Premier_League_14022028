import java.util.Scanner;

public class PlayerSelection{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        String playerCategory;
        double heightInMeters;
        int meterToCentimetersRate = 100;
        int heightInCentimeters;
        double weightInPounds;
        int weightInKilograms;
        final double poundsToKilogramsRate = 0.45359237;
        int jerseyNumber;
        String playerPosition;
        String hasAttackerJersey;
        String playerEligibility;
        String playerLineupDecision;
        String playerFinalDecision;

        System.out.println("What's the player's name: ");
        name = input.nextLine();

        System.out.println("What's the player's age: ");
        age = input.nextInt();

        System.out.println("What's the player's weight in pounds: ");
        weightInPounds = input.nextDouble();
        weightInKilograms = (int)(poundsToKilogramsRate * weightInPounds);

        System.out.println("What's the player's height in meters");
        heightInMeters = input.nextDouble();
        heightInCentimeters = (int)(meterToCentimetersRate * heightInMeters);

        System.out.println("What's the player's jersey number: ");
        jerseyNumber = input.nextInt();


        if (age < 20){
            playerCategory = "Rising Star";
        }
        else if (age >= 20 && age <= 30){
            playerCategory = "Prime Player";
        }
        else{
            playerCategory = "Veteran";
        }


        switch(jerseyNumber){
            case 1:
                playerPosition = "Goalkeeper";
                break;
            case 2:
                playerPosition = "Defender";
                break;
            case 5:
                playerPosition = "Defender";
                break;
            case 6:
                playerPosition = "Midfielder";
                break;
            case 7:
                playerPosition = "Winger";
                break;
            case 8:
                playerPosition = "Midfielder";
                break;
            case 9:
                playerPosition = "Striker";
                break;
            case 10:
                playerPosition = "Playmaker";
                break;
            case 11:
                playerPosition = "Winger";
                break;
            default:
                playerPosition = "Position not determined";
        }

        hasAttackerJersey = (playerPosition == "Winger" || playerPosition == "Striker" || playerPosition == "Playmaker") ? "Yes" : "No";
        playerEligibility = (age >= 18 && age <= 35 && weightInKilograms < 90) ? "Eligible" : "Not Eligible";
        playerLineupDecision = (playerCategory == "Prime Player" && weightInKilograms < 80) ? "In the starting lineup" : "On the bench";
        playerFinalDecision = (playerLineupDecision == "In the starting lineup") ? "Play" : "Rest";


        System.out.println("Player Report: \n--------------------");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + "  (" + playerCategory + ")");
        System.out.println("Height: " + heightInCentimeters + " cm");
        System.out.println("Weight: " + weightInKilograms + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + playerPosition);
        System.out.println("Attacker jersey: " + hasAttackerJersey);
        System.out.println("Eligibility: " + playerEligibility);
        System.out.println("Lineup Decision: " + playerLineupDecision);
        System.out.println("Final Decision: " + playerFinalDecision);
    }
}