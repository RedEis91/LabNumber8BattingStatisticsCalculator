import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println();
        //String to hold users "Continue?/Another batter?" response
        String contin = "Y";
        do {
            //ask for player name
            String playerName;
            System.out.print("Player name: ");
            playerName = scan.nextLine();
            //ask for the number at bats
            System.out.print("Enter number of times at bat : ");
            int atBats;
            atBats = scan.nextInt();
            // double to hold total amount of at-bats in which user got at least 1 base
            double earnedBase = 0.000;
            // int variable to hold total of bases earned
            int bases = 0;
            // initialize array based on number of times at bat
            int[] basesEarned = new int[atBats];
            System.out.println();
            //give user info for what to input for bases earned
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            //for each at bat, ask the user for the number of bases earned by the batter
            for (int i = 0; i < atBats; i++ ) {

                System.out.print("Result for at-bat " + (i+1) + ": ");
                basesEarned[i] = scan.nextInt();
                if (basesEarned[i] > 4 || basesEarned[i] < 0) {
                    do {
                        System.out.println("Invalid entry.");
                        System.out.print("Please enter a whole number between 0-4: ");
                        basesEarned[i] = scan.nextInt();
                    } while (basesEarned[i] > 4 || basesEarned[i] < 0);
                }
                bases += basesEarned[i];
                if (basesEarned[i] > 0) {
                    earnedBase++;
                }

                }
            //after all of the at-bats are entered, display the batting average and slugging percentage of the batter
            double battingAvg = 0.000;
            //only calculates batting average if bases were earned, to prevent a divide by zero error
            if (earnedBase > 0) {battingAvg =   earnedBase / (double)atBats; }
            //converts double into string to ensure 3 decimal places
            String avg = String.format("%.4g%n", battingAvg);
            System.out.println(playerName+ "'s batting average: " + avg);
            // and slugging percentage of the batter
            double sluggingPercentage = 0.000;
            sluggingPercentage = bases/ (double)atBats;
            //converts double into string to ensure 3 decimal places
            String slug = String.format("%.4g%n", sluggingPercentage);
            System.out.println(playerName+ "'s slugging percentage: " + slug);
            System.out.println();
            System.out.print("Another batter? (y/n): ");

            scan.nextLine();
            //sets contin(ue) variable based on user input
            contin = scan.nextLine();
        }
        while (contin.contains("Y") || contin.contains("y"));
        System.out.println("Thanks for playing!");
    }

}
